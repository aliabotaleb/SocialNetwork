public class Main {
    public static final String DASHES = new String(new char[80]).replace("\0", "-");
    /**
     * COMPLETE THIS METHOD to create the graph structure shown in the project brief
     * @param socialNetwork stores the graph structure
     */
    private static void buildGraph(SocialNetwork socialNetwork) {

    }

    /**
     * Full test for the broadcastTo method
     * @param theSocialNetwork stores the graph structure
     */
    private static void testBroadCastTo(SocialNetwork theSocialNetwork) {
        System.out.println(DASHES);
        System.out.println("broadcastTo test\n");
        for (int i = 0; i < Names.networkMembers.length; i++) {
            System.out.print("Followers of " + Names.networkMembers[i] + ": ");
            System.out.println(theSocialNetwork.broadcastsTo(Names.networkMembers[i]));
        }
        System.out.println();
    }
    /**
     * Full test for the canReach method
     * @param theSocialNetwork stores the graph structure
     */
    private static void canReachTest(SocialNetwork theSocialNetwork) {
        System.out.println(DASHES);
        System.out.println("canReach test\n");
        StringBuilder canReach = new StringBuilder();
        for (int i = 0; i < Names.networkMembers.length; i++) {
            for (int j = 0; j < Names.networkMembers.length; j++) {
                if (j != i && theSocialNetwork.canReach(Names.networkMembers[i], Names.networkMembers[j])) {
                    canReach.append(Names.networkMembers[j]).append(" ");
                }
            }
            if (canReach.length() == 0) {
                canReach = new StringBuilder(" no one!");
            }
            System.out.println(Names.networkMembers[i] + " can reach " + canReach);
            canReach = new StringBuilder();
        }
    }
    /**
     * Full test for the receiversOf method
     * @param theSocialNetwork stores the graph structure
     */
    private static void receiversOfTest(SocialNetwork theSocialNetwork) {
        System.out.println(DASHES);
        System.out.println("receiversOf test\n");
        for (int i = 0; i < Names.networkMembers.length; i++) {
            System.out.print("Receivers of " + Names.networkMembers[i] + ": ");
            System.out.println(theSocialNetwork.receiversOf(Names.networkMembers[i]));
        }
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SocialNetwork theSocialNetwork = new SocialNetwork();
        buildGraph(theSocialNetwork);
        testBroadCastTo(theSocialNetwork);

        canReachTest(theSocialNetwork);

        receiversOfTest(theSocialNetwork);
    }




}
