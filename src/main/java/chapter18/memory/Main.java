package chapter18.memory;

public class Main {
    public static void main(String[] args) {
        GameCareTaker careTaker = new GameCareTaker();

        GamePlayer player = new GamePlayer();

        player.showGamePlayerState();

        player.fighting();

        player.showGamePlayerState();

        GameStateMemory gameState = player.saveState();

        careTaker.setGameState(gameState);

        player.fighting();
        player.fighting();
        player.fighting();


        player.showGamePlayerState();

        player.recoverPlayerState(careTaker.getGameState());


        player.showGamePlayerState();
    }
}
