public class GameMain11 {
    public static void main(String[] args) {
        Game11 game = new Game11(15, 15, 10, 10);
        game.printPosition();
        game.moveLeft();
        game.printPosition();

        game.moveUp();
        game.printPosition();

        game.moveRight();
        game.printPosition();

        game.moveDown();
        game.printPosition();
    }
}
