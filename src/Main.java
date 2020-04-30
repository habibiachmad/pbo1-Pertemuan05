public class Main {
    public static void main(String[] args) {
        Bidak player1 = new Bidak();
    Bidak player2 = new Bidak();
    Board Bentuk = new Board();

    player1.King = "Jalan 1 step kesetiap arah";
    player1.Queen = "Jalan Serong dan Lurus sampai Ujung Board";
    player1.Bishop = "Jalan Serong ";
    player1.Knight = "Jalan Bentuk L";
    player1.Rook = "Jalan Lurus ";
    player1.Pion = "Jalan 1 step kedepan(Kecuali langkanh Pertama bisa 2 step)";
    Bentuk.bentuk = "Persegi";
        Bentuk.Ukuran = 600*600;
        Bentuk.banyakKotak = 8*8;
        player1.eatEnemy();

        System.out.println(player1.Death);
        player1.eatEnemy(player2);
        System.out.println(player1.Death);

    }
}
