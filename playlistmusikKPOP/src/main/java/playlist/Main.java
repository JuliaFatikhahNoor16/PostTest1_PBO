package playlist;

import model.Playlist;
import model.Song;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Playlist playlist = new Playlist("\n=========== Playlist Musik KPOP ===========");
            
            Song song1 = new Song("Butter", "BTS", "2.44", 2021);
            Song song2 = new Song("How You Like That", "BLACKPINK", "3.00", 2020);
            Song song3 = new Song("Dynamite", "BTS", "3.19", 2020);
            Song song4 = new Song("Next Level", "aespa", "3.41", 2021);
            Song song5 = new Song("Lovesick Girls", "BLACKPINK", "3.12", 2020);
            
            playlist.addSong(song1);
            playlist.addSong(song2);
            playlist.addSong(song3);
            playlist.addSong(song4);
            playlist.addSong(song5);
            
            boolean running = true;
            while (running) {
                System.out.println("\n+-----------------------------------------+");
                System.out.println("=========== Playlist Musik KPOP ===========");
                System.out.println("|              1. Tambah Lagu             |");
                System.out.println("|              2. Hapus Lagu              |");
                System.out.println("|              3. Tampilkan Playlist      |");
                System.out.println("|              4. Edit Lagu               |");
                System.out.println("|              5. Total Lagu              |");
                System.out.println("|              6. Keluar                  |");
                System.out.println("+-----------------------------------------+");
                System.out.print("\nPilih menu:");
                int choice = scanner.nextInt();
                scanner.nextLine();  
                
                switch (choice) {
                    case 1 -> {
                        
                        System.out.print("Judul lagu: ");
                        String title = scanner.nextLine();
                        System.out.print("Artis: ");
                        String artist = scanner.nextLine();
                        System.out.print("Durasi : ");
                        String duration = scanner.nextLine();
                        System.out.print("Tahun Rilis: ");
                        int year = Integer.parseInt(scanner.nextLine()); 
                        
                        Song newSong = new Song(title, artist, duration, year);
                        playlist.addSong(newSong);
                        System.out.println("Lagu berhasil ditambahkan.");
                    }
                    case 2 -> {
                        
                        System.out.print("Judul lagu yang ingin dihapus: ");
                        String removeTitle = scanner.nextLine();
                        playlist.removeSong(removeTitle);
                    }
                    case 3 -> 
                        playlist.displayPlaylist();
                    case 4 -> {
                        // Edit lagu
                        System.out.print("Judul lagu yang ingin diedit: ");
                        String editTitle = scanner.nextLine();
                        Song songToEdit = playlist.findSongByTitle(editTitle);
                        if (songToEdit != null) {
                            System.out.println("\n+----------------------------------------+");
                            System.out.println("==== Pilih properti yang ingin diedit ====");
                            System.out.println("+----------------------------------------+");
                            System.out.println("|              1. Judul                  |");
                            System.out.println("|              2. Artis                  |");
                            System.out.println("|              3. Durasi                 |");
                            System.out.println("|              4. Tahun Rilis            |");
                            System.out.println("+----------------------------------------+");
                            System.out.print("\nPilih menu: ");
                            int editChoice = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            
                            switch (editChoice) {
                                case 1 -> {
                                    System.out.print("Judul baru: ");
                                    String newTitle = scanner.nextLine();
                                    songToEdit.setTitle(newTitle);
                                    System.out.println("Judul lagu berhasil diubah.");
                                }
                                case 2 -> {
                                    System.out.print("Artis baru: ");
                                    String newArtist = scanner.nextLine();
                                    songToEdit.setArtist(newArtist);
                                    System.out.println("Artis lagu berhasil diubah.");
                                }
                                case 3 -> {
                                    System.out.print("Durasi baru : ");
                                    String newDuration = scanner.nextLine();
                                    songToEdit.setDuration(newDuration);
                                    System.out.println("Durasi lagu berhasil diubah.");
                                }
                                case 4 -> {
                                    System.out.print("Tahun rilis baru: ");
                                    int newYear = scanner.nextInt();
                                    songToEdit.setYear(newYear);
                                    System.out.println("Tahun rilis berhasil diubah.");
                                }
                                default -> System.out.println("Pilihan tidak valid.");
                            }
                        } else {
                            System.out.println("Lagu tidak ditemukan.");
                        }
                    }
                    case 5 -> // Tampilkan total lagu
                        System.out.println("Total lagu di semua playlist: " + Playlist.getTotalSongs());
                    case 6 -> {
                        // Keluar
                        running = false;
                        System.out.println("~Thank You for The Time You Spend With Me~");
                        System.out.println("            ~Have a Great Day~            ");
                    }
                    default -> System.out.println("Pilihan tidak valid.");
                }
            }
        }
    }
}
