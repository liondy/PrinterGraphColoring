# PrinterGraphColoring
Merupakan tugas akhir mata kuliah Struktur Diskret

Aplikasi ini berbentuk GUI dan berfungsi untuk mengatur printer mana yang digunakan pada sebuah tempat fotocopy dengan memanfaatkan teknik Graph Coloring

Aplikasi ini dibuat menggunakan netbeans, maka dari itu, folder-folder nya juga menyesuaikan netbeans agar dapat di run menggunakan netbeans

# Latar Belakang
Mahasiswa sering menggunakan jasa cetak untuk mencetak tugas-tugas mereka. Namun, printer yang digunakan tidak mungkin satu. Seringkali mahasiswa membutuhkan tugas-tugas mereka tercetak dengan cepat, namun mereka harus menunggu karena printer yang ada seringkali tidak bisa digunakan karena sedang dipakai oleh komputer lain. Sedangkan, apabila setiap komputer diberikan 1 buah printer, maka pengeluaran tinta akan besar. Oleh karena itu, dibutuhkan beberapa printer SE MINIMAL MUNGKIN agar bisa digunakan pada waktu yang bersamaan. Solusinya adalah dengan menggunakan metode pewarnaan graf dapat diketahui jumlah printer yang dibutuhkan. Pewarnaan graf adalah kasus khusus dari pelabelan graf. Pelabelan ini dilakukan dengan cara memberikan warna pada titik-titik, warna berbeda diberikan jika ada titik yang bertetangga. Dalam kasus ini, komputer-komputer yang ada pada jasa cetak akan dimodelkan dalam bentuk graph. Sebuah komputer memiliki waktu awal dan waktu akhir, apabila ada komputer lain dalam rentang tersebut yang digunakan, maka printer yang digunakan berbeda, apabila komputer lain digunakan dalam rentang waktu yang berbeda, maka printer yang digunakan harus sama untuk menghemat pengeluaran tinta.

Asumsi: 

    1. Suatu komputer hanya dapat dipakai selama maksimum 10 menit

    2. Setiap komputer memiliki 1 buah printer tetapi apabila suatu komputer dapat menggunakan printer pertama, maka akan diarahkan kepada printer pertama terlebih dahulu

    3. Tempat fotocopy hanya buka dari jam 7 pagi sampai 5 sore

# Metode Penyelesaian
Komputer-komputer yang ada dimodelkan ke dalam sebuah graph. 2 buah komputer bertetangga apabila ada komputer yang dipakai bersamaan pada saat itu atau apabila suatu komputer belum selesai pemakaiannya, sudah ada komputer lain yang dipakai (nabrak). Untuk pewarnaannya, digunakan teknik greedy untuk menentukan komputer mana memakai printer mana. Komputer yang memiliki warna yang sama akan mendapatkan printer yang sama, sedangkan komputer yang memiliki warna yang beda akan mendapatkan printer yang berbeda pula.

# Struktur Program
Pada src, terdapat file : 

    1. Discotics.java --> initialisasi awal dijalankan program
    
    2. FXMLDocument.fxml --> GUI
    
    3. FXMLDocumentController.fxml --> logika pemrograman
    
    4. FrmAboutController.fxml --> menampilkan halaman about
     
    5. Root.fxml --> GUI
    
    6. frmAbout.fxml --> GUI
    
# Discotics.java

    1. start() --> menjalankan program berupa canvas
    
    2. tes() --> menempelkan form about pada canvas tersebut
    
# FXMLDocumentController

    1. initialize() --> membuat tampilan awal program saat dijalankan
    
    2. process() --> menerima input berupa berapa banyak jumlah komputer dan menampilkan setiap komputer sesuai jumlah
    
    3. prosesJam1() --> memproses lamanya jam pada komputer 1
    
    4. prosesMenit1() --> memproses lamanya menit pada komputer 1
    
    5. prosesJam2() --> memproses lamanya jam pada komputer 2
    
    6. prosesMenit2() --> memproses lamanya menit pada komputer 2
    
    7. prosesJam3() --> memproses lamanya jam pada komputer 3
    
    8. prosesMenit3() --> memproses lamanya menit pada komputer 3
    
    9. prosesJam4() --> memproses lamanya jam pada komputer 4
    
    10. prosesMenit4() --> memproses lamanya menit pada komputer 4
    
    11. prosesJam5() --> memproses lamanya jam pada komputer 5
    
    12. prosesMenit5() --> memproses lamanya menit pada komputer 5
    
    13. prosesJam6() --> memproses lamanya jam pada komputer 6
    
    14. prosesMenit6() --> memproses lamanya menit pada komputer 6
    
    15. submit() --> memproses printer mana yang dipakai untuk suatu komputer berdasarkan waktu awal dan waktu akhir
    
    16. close() --> tutup program
    
    17. about() --> menampilkan halaman about
    
# Kelas Computer

Masing-masing komputer memiliki waktu awal dan waktu akhirnya masing-masing

Waktu awal didapat dari inputan user

Waku akhir didapat dari waktu awal + 10

    1. Computer() --> constructor untuk membuat sebuah komputer berdasarkan waktu awal dan waktu akhirnya
    
    2. getStart() --> mendapatkan waktu awal
    
    3. getEnd() --> mendapatkan waktu akhir
    
# Kelas Graph

Memodelkan komputer-komputer tersebut ke dalam sebuah graph

    1. Graph() --> constructor untuk memodelkan komputer ke dalam sebuah graph
    
    2. addEdge() --> menambahkan sisi sebuah graph apabila ada komputer yang sedang dipakai bersamaan / waktunya bertabrakan
    
    3. greedyColoring() --> berisi logika pemrograman untuk mewarnai graph nya dengan menggunakan teknik greedy (apabila ada komputer yang dipakai bersamaan, maka komputer tersebut tidak boleh diberi warna sama / komputer tersebut memakai printer yang berbeda dari komputer lain)
    
    4. getHasil() --> memberikan hasil graph coloring untuk diproses menjadi output
    
# Kesimpulan
Dengan memanfaatkan metode pewarnaan graf dapat diketahui jumlah printer maksimal yang dibutuhkan berdasarkan komputer yang sedang dipakai.
