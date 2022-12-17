import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){}

    // Singleton design pattern
    class Configuration {
        private static Configuration instance;
        private String setting1;
        private String setting2;

        private Configuration() {}

        public static Configuration getInstance() {
            if (instance == null) {
                instance = new Main().new Configuration();
            }
            return instance;
        }

        public void setSetting1(String value) {
            this.setting1 = value;
        }

        public void setSetting2(String value) {
            this.setting2 = value;
        }

        public String getSetting1() {
            return this.setting1;
        }

        public String getSetting2() {
            return this.setting2;
        }
    }

    // Observer design pattern
    interface ConfigurationObserver {
        void onConfigurationChanged();
    }

    class ConfigurationSubject {
        private List<ConfigurationObserver> observers;

        public ConfigurationSubject() {
            this.observers = new ArrayList<>();
        }

        public void attach(ConfigurationObserver observer) {
            this.observers.add(observer);
        }

        public void detach(ConfigurationObserver observer) {
            this.observers.remove(observer);
        }

        public void notifyObservers() {
            for (ConfigurationObserver observer : this.observers) {
                observer.onConfigurationChanged();
            }
        }
    }

    class ConfigurationChangeListener implements ConfigurationObserver {
        @Override
        public void onConfigurationChanged() {
            System.out.println("Configuration changed!");
        }
    }

    // Factory design pattern
    interface Shape {
        void draw();
    }

    class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
    }

    class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a rectangle");
        }
    }

    class ShapeFactory {
        public Shape getShape(String type) {
            switch (type) {
                case "circle":
                    return new Circle();
                case "rectangle":
                    return new Rectangle();
                default:
                    return null;
            }
        }
    }

    public class DesignPatternsExample {
        public static void main(String[] args) {
            // Demonstrate Singleton design pattern
            Configuration config = Configuration.getInstance();
            config.setSetting1("value1");
            config.setSetting2("value2");
            System.out.println(config.getSetting1());
            System.out.println(config.getSetting2());

            // Demonstrate Observer design pattern
            ConfigurationSubject subject = new Main().new ConfigurationSubject();
            ConfigurationChangeListener listener = new Main().new ConfigurationChangeListener();
            subject.attach(listener);
            subject.notifyObservers();

            // Demonstrate Factory design pattern
            ShapeFactory shapeFactory = new Main().new ShapeFactory();
            Shape circle = shapeFactory.getShape("circle");
            circle.draw();
            Shape rectangle = shapeFactory.getShape("rectangle");
            rectangle.draw();
        }



}}
    

