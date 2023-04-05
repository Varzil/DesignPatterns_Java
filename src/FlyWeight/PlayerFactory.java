package FlyWeight;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String, IPlayer> playerHashMap = new HashMap<>();

    private static final String TERRORIST_PLAYER_KEY = "terrorist";
    private static final String COUNTER_TERRORIST_PLAYER_KEY = "counterTerrorist";
    private static final String HERO_PLAYER_KEY = "hero";

    public static IPlayer getTerroristPlayer() {
        if (playerHashMap.containsKey(TERRORIST_PLAYER_KEY)) {
            return playerHashMap.get(TERRORIST_PLAYER_KEY);
        }
        IPlayer terrorist = new Terrorist();
        playerHashMap.put(TERRORIST_PLAYER_KEY, terrorist);
        return terrorist;
    }

    public static IPlayer getCounterTerroristPlayer() {
        if (playerHashMap.containsKey(COUNTER_TERRORIST_PLAYER_KEY)) {
            return playerHashMap.get(COUNTER_TERRORIST_PLAYER_KEY);
        }
        IPlayer counterTerrorist = new CounterTerrorist();
        playerHashMap.put(COUNTER_TERRORIST_PLAYER_KEY, counterTerrorist);
        return counterTerrorist;
    }

    public static IPlayer getHeroPlayer(){
        if(playerHashMap.containsKey(HERO_PLAYER_KEY)){
            return playerHashMap.get(HERO_PLAYER_KEY);
        }
        IPlayer hero=new Hero();
        playerHashMap.put(HERO_PLAYER_KEY, hero);
        return hero;
    }
}