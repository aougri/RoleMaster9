import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.permission.Role;
import org.javacord.api.entity.server.Server;
import org.javacord.api.entity.user.User;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        final String token = "MTAwMjA2NTUxNDcxOTM1MDgyNA.GE47BW.8AR8Yj_LBNQXORwcc0A0T2mp450ZUXLlA2g03M";
        DiscordApi api = new DiscordApiBuilder()
                // An inline listener
                .addMessageCreateListener(event -> {
                    Message message = event.getMessage();
                    if (message.getContent().equalsIgnoreCase("!ping")) {
                        event.getChannel().sendMessage("Pong!");
                    }
                })
                .addServerBecomesAvailableListener(event -> {
                    System.out.println("Loaded " + event.getServer().getName());
                })
                // A listener in their own class// Alternative syntax that can be used for classes that require a DiscordApi parameter in their constructor
                .setToken(token)
                .setWaitForServersOnStartup(false)
                .login()
                .join();


       api.addMessageCreateListener(event -> {
           Message message = event.getMessage();
           if (message.getContent().equalsIgnoreCase("!role AD")) {
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
            if (message.getContent().equalsIgnoreCase("!role AE")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538230279213066");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });


        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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
            if (message.getContent().equalsIgnoreCase("!role test")) {
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










    }



}
