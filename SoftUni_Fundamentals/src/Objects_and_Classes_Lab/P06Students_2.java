package Objects_and_Classes_Lab;

import java.util.*;

public class P06Students_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Map<String, Student> namesStudent = new LinkedHashMap<>();
            String data = scanner.nextLine();

            while (!data.equals("end")) {
                String[] tokens = data.split("\\s+");
                String firstName = tokens[0];
                String lastName = tokens[1];
                int age = Integer.parseInt(tokens[2]);
                String city = tokens[3];

                String names = firstName + " " + lastName;
                if (!namesStudent.containsKey(names)) {
                    Student student = new Student(firstName, lastName, age, city);
                    namesStudent.put(names, student);
                } else {
                    namesStudent.get(names).setAge(age);
                    namesStudent.get(names).setCity(city);
                }

                data = scanner.nextLine();
            }

            String filterCity = scanner.nextLine();
            namesStudent.entrySet().stream()
                    .filter(kvp -> kvp.getValue().getCity().equals(filterCity))
                    .forEach(kvp -> System.out.println(String.format("%s %s is %d years old", kvp.getValue().firstName, kvp.getValue().lastName, kvp.getValue().age)));
        }

        static class Student {
            private String firstName;
            private String lastName;
            private int age;
            private String city;

            public Student(String firstName, String lastName, int age, String city) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.age = age;
                this.city = city;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }
        }
    }
