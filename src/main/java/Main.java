import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.permission.Role;
import org.javacord.api.entity.server.Server;
import org.javacord.api.entity.user.User;

import java.util.Optional;

public class Main{
    public static void main(String[] args) {
        final String token = "MTAwMjA2NTUxNDcxOTM1MDgyNA.GzmHAW.nCWR5mZCBwfW0NXz5AiqW2DrAne0RU6-uY22Pc";
        DiscordApi api = new DiscordApiBuilder()
                .setToken(token)
                .login().join();


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AD")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538228437929985");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });



        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AE")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538230249852979");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AF")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538230396661821 ");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AG")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538231629795339");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AI")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538231881445476");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AL")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538232976150598");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AM")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538233030680667");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AO")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538233030680667");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AQ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538233798238310");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AR")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538233999556719");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AS")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538235182371017");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AT")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538920758124605");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AU")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538920774893599");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AW")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538922800754758");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AX")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538922821714011");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AZ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538922851074108");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                        message.addReaction("😃");
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BA")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538924285530192");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BB")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538925761941535");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BD")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538926105862315");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BE")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538927007645726");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BF")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538927863271595");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BG")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538928240771092");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BH")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538929255796767");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BI")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538930463752192");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BJ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001540192823414784");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BL")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001540193200918689");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BM")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BN")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BO")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BQ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BR")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BS")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BT")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BV")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BW")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BY")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role BZ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CA")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CC")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CD")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CF")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CG")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CH")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CI")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CK")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CL")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CM")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CN")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CO")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CR")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CU")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CV")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CW")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CX")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CY")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role CZ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role DE")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role DJ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role DM")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role DO")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role DZ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role EC")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role EE")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role EG")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role EH")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role ER")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role ES")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role ET")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role FI")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role FJ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role FK")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role FM")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role FO")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role FR")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GA")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GB")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GD")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GE")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GF")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GG")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GH")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GI")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GL")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GM")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GN")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GP")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GQ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GR")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GS")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GT")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GU")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GW")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role GY")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role HK")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role HM")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role HN")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role HR")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role HT")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role HU")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role ID")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role IE")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role IL")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role IM")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role IN")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role IQ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role IR")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role IS")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role IT")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role JE")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role JM")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role JO")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role JP")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role KE")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role KG")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role KH")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role KI")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role KM")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role KN")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role KP")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role KR")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role KW")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role KY")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role KZ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role LA")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role LB")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role LC")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role LI")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role LK")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role LR")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role LS")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role LT")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role LU")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role LV")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role LY")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MA")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MC")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MD")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role ME")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MF")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MG")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MH")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MK")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MN")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MO")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MP")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MQ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MR")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MS")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MT")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MU")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MV")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MW")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MX")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MY")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role MZ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role NA")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role NC")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role NF")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role NG")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role NI")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role NL")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role NO")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role NP")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role NR")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role NU")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role NZ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role OM")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role PA")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role PE")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role PF")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role PG")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role PH")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role PK")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role PL")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role PM")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role PN")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role PR")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role PS")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role PT")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role PW")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role PY")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role QA")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role RE")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role RO")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role RS")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role RU")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role RW")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SA")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SB")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SC")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SD")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SE")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SG")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SH")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SI")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SJ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SK")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SL")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SM")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SN")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SO")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SR")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SS")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role ST")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SV")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SX")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SY")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role SZ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role TC")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role TD")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role TF")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role TG")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role UG")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role VN")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role UA")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role TZ")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role TW")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role YE")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role ZA")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role ZM")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role ZW")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role TH")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role test")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role test")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role test")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role test")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role test")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role US")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("your role ID");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });



    }
}