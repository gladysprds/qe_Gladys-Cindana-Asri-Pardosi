# Gladys Cindana Pardosi
# Kelas_B_QE


# Map Data Structure


- Map ( Peta ) adalah generalisasi dari array. Seperti array, map juga memiliki operasi untuk mengambil dan meletakkan elemen. Akan tetapi pada map, operasi ini tidak dilakukan pada bilangan 0, 1, … N-1, akan tetapi pada sembarang Object. Beberapa bahasa pemrograman menggunakan istilah array asosiatif (associative array) karena kesamaan perintah dengan array biasa.

1. HashMap 

- HashMap adalah kelas implementasi dari Map, HashMap itu sendiri adalah interface yang mempunyai fungsi untuk memetakan nilai dengan kunci(key) unik ke dalam nilai (value). Kunci dan nilai(value) dalam HashMap boleh diset dengan null. HashMap sangat bermanfaat sebagai memory record management, dimana tiap record dapat disimpan disebuah Map. HashMap ini bisa diterapkan pada suatu aplikasi seperti kamus, yang mempunyai key dan value dalam aplikasi kamus ketika akan mencari arti dari suatu kata, kita akan memakai kata yang akan dicari artinya tersebut sebagai key, dan kita akan mendapatkan arti dari kata tersebut yang berupa value dari key yang telah kita masukkan. HashMap sangat cocok digunakan pada data cukup kompleks. Dengan demikian, programmer tidak harus menghafal letak index seperti pada array dan collection class sequence lainnya.

2. TreeMap 

- TreeMap  adalah salah satu implementasi dari class interface yang mengurutkan collection berdasarkan key dari elemen berupa pasangan <key, value>.

3. LinkedHashMap

- LinkedHashMap adalah kombinasi dari HashTable dan LinkedList. Memiliki urutan iterasi yang terprediksi oleh linked list, namun pencarian yang cepat dalam memetakan value dan key ialah  HashMap. Urutan iterasi ditentukan oleh urutan penyisipan, kemudian akan mendapatkan kunci(key) / nilai(value) kembali dalam urutan serta akan ditambahkan ke suatu Map. Disini harus sedikit berhati-hati, karena kembalinya memasukkan kunci (key) tidak mengubah urutan asli.

4. WeakHashMap
   
- WeakHashMap adalah implementasi antarmuka Peta yang hanya menyimpan referensi lemah ke kuncinya. Menyimpan hanya referensi yang lemah memungkinkan pasangan nilai kunci untuk dikumpulkan dengan sampah ketika kuncinya tidak lagi direferensikan di luar WeakHashMap.

5. IdentityHashMap

- IdentityHashMap mengimplementasikan antarmuka Peta menggunakan Hashtable , menggunakan kesetaraan referensi sebagai ganti kesetaraan objek saat membandingkan kunci (dan nilai).

6. EnumMap 
   
- EnumMap adalah implementasi khusus dari antarmuka Peta untuk jenis enumerasi . Ini memperluas AbstractMap dan mengimplementasikan antarmuka Peta di Java. EnumMap adalah koleksi terurut dan mereka dipertahankan dalam urutan alami kunci mereka (urutan kunci alami berarti urutan konstanta enum dideklarasikan di dalam enum type).