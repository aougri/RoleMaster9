package bot;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.permission.Role;
import org.javacord.api.entity.server.Server;
import org.javacord.api.entity.user.User;

import java.util.Optional;

public class Main{
    public static void main(String[] args) {
        final String token = "";
        DiscordApi api = new DiscordApiBuilder()
                .setToken(token)
                .login().join();

        System.out.println("Bot is working and on" + " "+ api.createBotInvite());

        api.addMessageCreateListener(event -> {
            Message message = event.getMessage();
            if (message.getContent().equalsIgnoreCase("rm!role AD")) {
                if (event.getServer().isPresent()) {
                    Server server = event.getServer().get();

                    Optional<User> author = event.getMessageAuthor().asUser();
                    Optional<Role> role = server.getRoleById("1001538228437929985");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                        message.addReaction("😃");

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
                        message.addReaction("😃");

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
                        message.addReaction("😃");

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
                        message.addReaction("😃");

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
                    Optional<Role> role = server.getRoleById("1001540195847524422");


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
                    Optional<Role> role = server.getRoleById("1001540195168030720");


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
                    Optional<Role> role = server.getRoleById("1001540195931410432");


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
                    Optional<Role> role = server.getRoleById("1001545688598991020");


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
                    Optional<Role> role = server.getRoleById("1001545690817765448");


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
                    Optional<Role> role = server.getRoleById("1001545692000571603");


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
                    Optional<Role> role = server.getRoleById("1001545693317578922");


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
                    Optional<Role> role = server.getRoleById("1001545693657309244");


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
                    Optional<Role> role = server.getRoleById("1001545695179841617");


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
                    Optional<Role> role = server.getRoleById("1001545695616045230");


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
                    Optional<Role> role = server.getRoleById("1001545696782078023");


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
                    Optional<Role> role = server.getRoleById("1001545696782078023");


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
                    Optional<Role> role = server.getRoleById("1001545697537052812");


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
                    Optional<Role> role = server.getRoleById("1001545698262651041");


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
                    Optional<Role> role = server.getRoleById("1001545699470622750");


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
                    Optional<Role> role = server.getRoleById("1001545700229791784");


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
                    Optional<Role> role = server.getRoleById("1001545700900880447");


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
                    Optional<Role> role = server.getRoleById("1001545701718773770");


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
                    Optional<Role> role = server.getRoleById("1001545702394056724");


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
                    Optional<Role> role = server.getRoleById("1001545703283236925");


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
                    Optional<Role> role = server.getRoleById("1001545703421644920");


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
                    Optional<Role> role = server.getRoleById("1001545704084340786");


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
                    Optional<Role> role = server.getRoleById("1001546892708159549");


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
                    Optional<Role> role = server.getRoleById("1001546893282787348");


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
                    Optional<Role> role = server.getRoleById("1001546894146797599");


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
                    Optional<Role> role = server.getRoleById("1001546895090532362");


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
                    Optional<Role> role = server.getRoleById("1001546896650809426");


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
                    Optional<Role> role = server.getRoleById("1001546897628078091");


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
                    Optional<Role> role = server.getRoleById("1001546898068480060");


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
                    Optional<Role> role = server.getRoleById("1001546899385495634");


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
                    Optional<Role> role = server.getRoleById("1001546899884621897");


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
                    Optional<Role> role = server.getRoleById("1001546900295647375");


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
                    Optional<Role> role = server.getRoleById("1001546900484411404");


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
                    Optional<Role> role = server.getRoleById("1001546901658812557");


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
                    Optional<Role> role = server.getRoleById("1001546903021944862");


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
                    Optional<Role> role = server.getRoleById("1001546903760162986");


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
                    Optional<Role> role = server.getRoleById("1001546904380903515");


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
                    Optional<Role> role = server.getRoleById("1001546905228161094");


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
                    Optional<Role> role = server.getRoleById("1001546906062831636");


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
                    Optional<Role> role = server.getRoleById("1001546906444513282");


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
                    Optional<Role> role = server.getRoleById("1001546907669250209");


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
                    Optional<Role> role = server.getRoleById("1001546908369682533");


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
                    Optional<Role> role = server.getRoleById("1001546909342773328");


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
                    Optional<Role> role = server.getRoleById("1001546913541263521");


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
                    Optional<Role> role = server.getRoleById("1001553338288062495");


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
                    Optional<Role> role = server.getRoleById("1001553338904612994");


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
                    Optional<Role> role = server.getRoleById("1001553340783677630");


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
                    Optional<Role> role = server.getRoleById("1001553341572186142");


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
                    Optional<Role> role = server.getRoleById("1001553343103115385");


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
                    Optional<Role> role = server.getRoleById("1001553343245721650");


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
                    Optional<Role> role = server.getRoleById("1001553345082826812");


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
                    Optional<Role> role = server.getRoleById("1001553345275772938");


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
                    Optional<Role> role = server.getRoleById("1001553346408239215");


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
                    Optional<Role> role = server.getRoleById("1001553347108667412");


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
                    Optional<Role> role = server.getRoleById("1001553347272249496");


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
                    Optional<Role> role = server.getRoleById("1001553348740259930");


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
                    Optional<Role> role = server.getRoleById("1001553349742702693");


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
                    Optional<Role> role = server.getRoleById("1001553349767864400");


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
                    Optional<Role> role = server.getRoleById("1001553351068090479");


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
                    Optional<Role> role = server.getRoleById("1001553351810498650");


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
                    Optional<Role> role = server.getRoleById("1001553352565477376");


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
                    Optional<Role> role = server.getRoleById("1001553353463050271");


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
                    Optional<Role> role = server.getRoleById("1001553355027513355");


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
                    Optional<Role> role = server.getRoleById("1001553355702812773");


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
                    Optional<Role> role = server.getRoleById("1001553356768157787");


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
                    Optional<Role> role = server.getRoleById("1001553356852052020");


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
                    Optional<Role> role = server.getRoleById("1001553358278103141");


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
                    Optional<Role> role = server.getRoleById("1001553359112777839");


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
                    Optional<Role> role = server.getRoleById("1001553363051237467");


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
                    Optional<Role> role = server.getRoleById("1001554919322562721");


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
                    Optional<Role> role = server.getRoleById("1001554920094314547");


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
                    Optional<Role> role = server.getRoleById("1001554919322562721");


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
                    Optional<Role> role = server.getRoleById("1001554921658781737");


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
                    Optional<Role> role = server.getRoleById("1001554922048864436");


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
                    Optional<Role> role = server.getRoleById("1001554923835621448");


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
                    Optional<Role> role = server.getRoleById("1001554923961454602");


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
                    Optional<Role> role = server.getRoleById("1001554924900995206");


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
                    Optional<Role> role = server.getRoleById("1001554925035204718");


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
                    Optional<Role> role = server.getRoleById("1001554925865672876");


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
                    Optional<Role> role = server.getRoleById("1001554927488868364");


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
                    Optional<Role> role = server.getRoleById("1001554928910737541");


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
                    Optional<Role> role = server.getRoleById("1001554928910737541");


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
                    Optional<Role> role = server.getRoleById("1001554929690882149");


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
                    Optional<Role> role = server.getRoleById("1001554930831740939");


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
                    Optional<Role> role = server.getRoleById("1001554931163074762");


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
                    Optional<Role> role = server.getRoleById("1001554931704139986");


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
                    Optional<Role> role = server.getRoleById("1001554932761112616");


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
                    Optional<Role> role = server.getRoleById("1001554933692244008");


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
                    Optional<Role> role = server.getRoleById("1001554933692244008");


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
                    Optional<Role> role = server.getRoleById("1001554933792907265");


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
                    Optional<Role> role = server.getRoleById("1001554934644363476");


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
                    Optional<Role> role = server.getRoleById("1001554935932002305");


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
                    Optional<Role> role = server.getRoleById("1001554936418533507");


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
                    Optional<Role> role = server.getRoleById("1001554937295147120");


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
                    Optional<Role> role = server.getRoleById("1001554937924288532");


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
                    Optional<Role> role = server.getRoleById("1001554938826084422");


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
                    Optional<Role> role = server.getRoleById("1001554939589447700");


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
                    Optional<Role> role = server.getRoleById("1001554940621234248");


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
                    Optional<Role> role = server.getRoleById("1001554940860313611");


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
                    Optional<Role> role = server.getRoleById("1001554941091008594");


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
                    Optional<Role> role = server.getRoleById("1001556444509896794");


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
                    Optional<Role> role = server.getRoleById("1001556445319401502");


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
                    Optional<Role> role = server.getRoleById("1001556446309265529");


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
                    Optional<Role> role = server.getRoleById("1001556447039082607");


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
                    Optional<Role> role = server.getRoleById("1001556448087654420");


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
                    Optional<Role> role = server.getRoleById("1001556448905531422");


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
                    Optional<Role> role = server.getRoleById("1001556449136226334");


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
                    Optional<Role> role = server.getRoleById("1001556450813943900");


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
                    Optional<Role> role = server.getRoleById("1001556449157206157");


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
                    Optional<Role> role = server.getRoleById("1001556450339979314");


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
                    Optional<Role> role = server.getRoleById("1001556453733183699");


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
                    Optional<Role> role = server.getRoleById("1001556454442008657");


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
                    Optional<Role> role = server.getRoleById("1001556455729668106");


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
                    Optional<Role> role = server.getRoleById("1001556456778244106");


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
                    Optional<Role> role = server.getRoleById("1001556458611155024");


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
                    Optional<Role> role = server.getRoleById("1001556460095930378");


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
                    Optional<Role> role = server.getRoleById("1001556461127737364");


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
                    Optional<Role> role = server.getRoleById("1001556462180515840");


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
                    Optional<Role> role = server.getRoleById("1001556462243434546");


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
                    Optional<Role> role = server.getRoleById("1001556463124238466");


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
                    Optional<Role> role = server.getRoleById("1001556465208791163");


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
                    Optional<Role> role = server.getRoleById("1001556466433536010");


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
                    Optional<Role> role = server.getRoleById("1001556466798448790");


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
                    Optional<Role> role = server.getRoleById("1001556467851198524");


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
                    Optional<Role> role = server.getRoleById("1001556468903981077");


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
                    Optional<Role> role = server.getRoleById("1001556469847691336");


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
                    Optional<Role> role = server.getRoleById("1001556471470899270");


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
                    Optional<Role> role = server.getRoleById("1001556471487660052");


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
                    Optional<Role> role = server.getRoleById("1001556472586571776");


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
                    Optional<Role> role = server.getRoleById("1001556473882607696");


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
                    Optional<Role> role = server.getRoleById("1001556473945542788");


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
                    Optional<Role> role = server.getRoleById("1001556476084621369");


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
                    Optional<Role> role = server.getRoleById("1001556477389066260");


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
                    Optional<Role> role = server.getRoleById("1001556477544251495");


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
                    Optional<Role> role = server.getRoleById("1001556478894800903");


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
                    Optional<Role> role = server.getRoleById("1001556479314247740");


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
                    Optional<Role> role = server.getRoleById("1001556480044052591");


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
                    Optional<Role> role = server.getRoleById("1001556481855991829");


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
                    Optional<Role> role = server.getRoleById("1001556482300579840");


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
                    Optional<Role> role = server.getRoleById("1001556482980065402");


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
                    Optional<Role> role = server.getRoleById("1001558754002739211");


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
                    Optional<Role> role = server.getRoleById("1001558754896121906");


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
                    Optional<Role> role = server.getRoleById("1001558756376723547");


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
                    Optional<Role> role = server.getRoleById("1001558756431237241");


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
                    Optional<Role> role = server.getRoleById("1001558757215588434");


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
                    Optional<Role> role = server.getRoleById("1001558757215588434");


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
                    Optional<Role> role = server.getRoleById("1001558757911838742");


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
                    Optional<Role> role = server.getRoleById("1001558758113153184");


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
                    Optional<Role> role = server.getRoleById("1001558760776552510");


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
                    Optional<Role> role = server.getRoleById("1001558760776552510");


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
                    Optional<Role> role = server.getRoleById("1001558761665732680");


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
                    Optional<Role> role = server.getRoleById("1001558764727574558");


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
                    Optional<Role> role = server.getRoleById("1001558764727574558");


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
                    Optional<Role> role = server.getRoleById("1001558766547902575");


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
                    Optional<Role> role = server.getRoleById("1001558766648561756");


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
                    Optional<Role> role = server.getRoleById("1001558767625830450");


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
                    Optional<Role> role = server.getRoleById("1001558768515043481");


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
                    Optional<Role> role = server.getRoleById("1001558769135783960");


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
                    Optional<Role> role = server.getRoleById("1001558769513275473");


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
                    Optional<Role> role = server.getRoleById("1001558770532503622");


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
                    Optional<Role> role = server.getRoleById("1001558772520603699");


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
                    Optional<Role> role = server.getRoleById("1001558772856139846");


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
                    Optional<Role> role = server.getRoleById("1001558773002936431");


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
                    Optional<Role> role = server.getRoleById("1001558775066538015");


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
                    Optional<Role> role = server.getRoleById("1001558775188173011");


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
                    Optional<Role> role = server.getRoleById("1001558776790397079");


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
                    Optional<Role> role = server.getRoleById("1001558778891751424");


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
                    Optional<Role> role = server.getRoleById("1001558806838394880");


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
                    Optional<Role> role = server.getRoleById("1001558808524488865");


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
                    Optional<Role> role = server.getRoleById("1001558808599990282");


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
                    Optional<Role> role = server.getRoleById("1001558808893587586");


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
                    Optional<Role> role = server.getRoleById("1001558808893587586");


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
                    Optional<Role> role = server.getRoleById("1001558810407731310");


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
                    Optional<Role> role = server.getRoleById("1001561216713502720");


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
                    Optional<Role> role = server.getRoleById("1001561222673608895");


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
                    Optional<Role> role = server.getRoleById("1001561222694576268");


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
                    Optional<Role> role = server.getRoleById("1001561223575375963");


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
                    Optional<Role> role = server.getRoleById("1001561225508945950");


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
                    Optional<Role> role = server.getRoleById("1001561225542504539");


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
                    Optional<Role> role = server.getRoleById("1001561227593515099");


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
                    Optional<Role> role = server.getRoleById("1001561227627085915");


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
                    Optional<Role> role = server.getRoleById("1001561228281385061");


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
                    Optional<Role> role = server.getRoleById("1001561230131077201");


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
                    Optional<Role> role = server.getRoleById("1001561230240141382");


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
                    Optional<Role> role = server.getRoleById("1001561230353383564");


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
                    Optional<Role> role = server.getRoleById("1001561231607472198");


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
                    Optional<Role> role = server.getRoleById("1001561232651849810");


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
                    Optional<Role> role = server.getRoleById("1001561232668643368");


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
                    Optional<Role> role = server.getRoleById("");


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
                    Optional<Role> role = server.getRoleById("1001561234405068814");


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
                    Optional<Role> role = server.getRoleById("1001561238729404506");


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
                    Optional<Role> role = server.getRoleById("1001561240923025468");


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
                    Optional<Role> role = server.getRoleById("1001561242177114183");


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
                    Optional<Role> role = server.getRoleById("1001561230240141382");


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
                    Optional<Role> role = server.getRoleById("1001561226494619648");


                    if (role.isPresent() && author.isPresent()) {
                        server.addRoleToUser(author.get(), role.get()).join();
                    }
                }
            }
        });



    }
}