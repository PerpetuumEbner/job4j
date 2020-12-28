package ru.job4j.tracker;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SqlTracker implements Store {
    private Connection connection;

    public SqlTracker(Connection connection) {
        this.connection = connection;
    }

    public SqlTracker() {

    }

    public void init() {
        try (InputStream in = SqlTracker.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            connection = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void close() throws Exception {
        if (connection != null) {
            connection.close();
        }
    }

    @Override
    public Item add(Item item) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO tracker.public.items VALUES (?)")) {
            preparedStatement.setString(1, item.getName());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return item;
    }

    @Override
    public boolean replace(String id, Item item) {
        boolean result = false;
        try (PreparedStatement preparedStatement = connection.prepareStatement(
                "UPDATE tracker.public.items SET name = ? WHERE id = ?")) {
            preparedStatement.setString(1, item.getName());
            preparedStatement.setString(2, id);
            preparedStatement.executeUpdate();
            if (preparedStatement.executeUpdate() != 0) {
                result = true;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(String id) {
        boolean result = false;
        try (PreparedStatement preparedStatement = connection.prepareStatement(
                "DELETE FROM tracker.public.items WHERE id = ?")) {
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
            if (preparedStatement.executeUpdate() != 0) {
                result = true;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Item> findAll() {
        List<Item> list = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT * FROM tracker.public.items")) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Item("" + resultSet.getInt("id"), resultSet.getString("name")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Item> findByName(String key) {
        List<Item> list = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT * FROM tracker.public.items WHERE name = ?")) {
            preparedStatement.setString(1, key);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new Item("id", "name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }

    @Override
    public Item findById(String id) {
        Item item = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT * FROM tracker.public.items WHERE id = ?")) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                item = new Item("id", "name");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return item;
    }
}