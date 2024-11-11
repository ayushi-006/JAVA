package oppe_1_practise;

import java.util.*;

//public class Maps {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        Map<String, ArrayList<Integer>> pmap = new LinkedHashMap<String, ArrayList<Integer>>();
//        for(int i = 0; i < 3; i++) {
//            ArrayList<Integer> pruns = new ArrayList<Integer>();
//            String name = sc.next();
//            for(int j = 0; j < 3; j++) {
//                pruns.add(sc.nextInt());
//            }
//            pmap.put(name, pruns);
//        }
//        Team t = new Team(pmap);
//        System.out.println(FClass.getFinalList(t));
//        }
//    }


class Team{
    private Map<String, ArrayList<Integer>> playerMap;
    public Team( Map<String, ArrayList<Integer>> m) {
        playerMap = m;
    }
    public Map<String, ArrayList<Integer>> getPlayerMap(){
        return playerMap;
    }
}

class FClass{
    public static ArrayList<String> getFinalList(Team t){
        ArrayList<String> pList = new ArrayList<String>();
        Map<String,ArrayList<Integer>> pmap = t.getPlayerMap();
        for (String p : pmap.keySet()){
            boolean flag = true;
            for(Integer i: pmap.get(p)){
                if(i<80){
                    flag = false;
                    break;
                }
            }
            if(flag);
            pList.add(p);

        }
        return pList;


    }

}
public class Maps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<Integer>> pmap = new LinkedHashMap<String, ArrayList<Integer>>();

        for(int i = 0; i < 3; i++) {
            ArrayList<Integer> pruns = new ArrayList<Integer>();
            String name = sc.next();
            for(int j = 0; j < 3; j++) {
                pruns.add(sc.nextInt());
            }
            pmap.put(name, pruns);
        }
        Team t = new Team(pmap);
        System.out.println(FClass.getFinalList(t));
        }
    }

