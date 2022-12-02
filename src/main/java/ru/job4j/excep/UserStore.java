package ru.job4j.excep;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User temp = null;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                temp = user;
                break;
            }
        }
            if (temp == null) {
                throw new UserNotFoundException("User not found");
            }
            return temp;
    }

        public static boolean validate(User user) throws UserInvalidException {
            if (!user.isValid() || user.getUsername().length() < 3) {
                throw new UserInvalidException("User not Valid");
            }
            return true;
        }

        public static void main(String[]args) {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            try {
                User user = findUser(users, "Petr Arsentev");
                if (validate(user)) {
                    System.out.println("This user has an access");
                }
            } catch (UserInvalidException ui) {
                ui.printStackTrace();
            } catch (UserNotFoundException un) {
                un.printStackTrace();
            }
        }
   }

