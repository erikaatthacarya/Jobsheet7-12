public class ScavengerHunt09 {
    Point09 head;

    public void addPoint(String question, String answer) {
        Point09 newPoint = new Point09(question, answer);
        if (head == null) {
            head = newPoint;
        } else {
            Point09 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPoint;
        }
    }
    public void startGame() {
        if (head == null) {
            System.out.println("Tidak ada point dalam game.");
            return;
        }
        Point09 current = head;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        while (current != null) {
            System.out.println("Soal   : " + current.question);
            System.out.print("Jawaban: ");
            String userAnswer = scanner.nextLine();
            
            if (userAnswer.equalsIgnoreCase(current.answer)) {
                System.out.println("Benar! Lanjut ke point berikutnya.\n");
                current = current.next;
            } else {
                System.out.println("Salah. Coba lagi.\n");
            }
        }
        System.out.println("Selamat! Anda telah menemukan harta karun!");
        scanner.close();
    }
}
