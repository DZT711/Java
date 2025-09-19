# Java Tổng Hợp: Lý Thuyết + Tutorial + Ví dụ cho người mới

Tài liệu này tổng hợp các khái niệm cơ bản trong Java, cách dùng File I/O, OOP, interface, inheritance… Có lý thuyết + ví dụ để bạn mới học có thể tham khảo & nhớ lâu.

---

## Mục lục

1. [Lý thuyết cơ bản](#1-lý-thuyết-cơ-bản)  
2. [OOP & Các khái niệm liên quan](#2-oop--các-khái-niệm-liên-quan)  
   - Class & Object  
   - Inheritance (Kế thừa)  
   - Polymorphism (Đa hình)  
   - Abstraction & Interface  
   - Encapsulation  
   - Constructors  
3. [File I/O: FileWriter / FileReader + các thao tác với file](#3-file-io-filewriter--filereader--các-thao-tác-với-file)  
4. [Data Structures trong Java](#4-data-structures-trong-java)  
5. [Ví dụ thực hành tổng hợp](#5-ví-dụ-thực-hành-tổng-hợp)  
6. [Tips & Best Practices](#6-tips--best-practices)  

---

## 1. Lý thuyết cơ bản

- Ngôn ngữ Java: hướng đối tượng (OOP), chạy trên JVM, quản lý bộ nhớ tự động (garbage collection).  
- Kiểu dữ liệu cơ bản (primitive): `int`, `long`, `short`, `byte`, `float`, `double`, `boolean`, `char`.  
- Kiểu dữ liệu tham chiếu (reference types): `String`, mảng (arrays), Objects, Collections.  
- Modifiers: `public`, `private`, `protected`, (default = package-private), `static`, `final`, `abstract`.  
- Exception vs Error: ngoại lệ checked (ví dụ `IOException`) và unchecked; sử dụng `try/catch/finally`, `throws`, `throw`.  

---

## 2. OOP & Các khái niệm liên quan

### Class & Object

- **Class** là khuôn mẫu định nghĩa các thuộc tính (fields) và hành vi (methods).  
- **Object** là thể hiện cụ thể của class.  
- **Constructor** là phương thức đặc biệt để khởi tạo object khi tạo mới.  

### Inheritance (Kế thừa)

- Dùng từ khóa `extends`.  
- Class con sẽ kế thừa fields & methods từ class cha, có thể override.  
- Mối quan hệ “is-a”.  

### Polymorphism (Đa hình)

- Gồm **method overriding** (runtime) & **method overloading** (compile-time).  
- Biến tham chiếu của superclass có thể trỏ tới object subclass.  

### Abstraction & Interface

- **Abstraction**: che dấu chi tiết thực thi, chỉ lộ ra những gì cần thiết.  
- Đạt được bằng cách dùng `abstract class` hoặc `interface`. Ví dụ, abstract class chứa method abstract + method thường; interface định nghĩa phương thức mà class implement phải tuân theo. :contentReference[oaicite:0]{index=0}

### Encapsulation (Đóng gói)

- Giấu dữ liệu bên trong class, biến `private`, chỉ cho truy cập qua getter/setter. :contentReference[oaicite:1]{index=1}  
- Giúp bảo vệ trạng thái object, giữ cho dữ liệu luôn hợp lệ.  

### Constructors (Phương thức khởi tạo)

- Là phương thức đặc biệt, tên phải trùng tên class, không có kiểu trả về (return type). :contentReference[oaicite:2]{index=2}  
- Dùng để khởi tạo trạng thái ban đầu cho object.  
- Có thể có nhiều constructor với các tham số khác nhau (overloading constructor).  
- Nếu không định nghĩa constructor nào, Java tự tạo constructor mặc định (không tham số). :contentReference[oaicite:3]{index=3}  

---

## 3. File I/O: FileWriter / FileReader + các thao tác với file

<!-- phần này giữ như cũ, không sửa -->

---

## 4. Data Structures trong Java

Dưới đây là các cấu trúc dữ liệu quan trọng thường gặp + cách chọn dùng.

| Data Structure | Khi nào dùng | Ưu điểm / Nhược điểm |
|---|---|---|
| **Array** | Khi biết trước số lượng phần tử, cần truy cập theo chỉ số nhanh. | Truy cập nhanh theo chỉ số, cố định kích thước. Thêm/bớt phần tử khó khăn. |
| **List** (`ArrayList`, `LinkedList`) | Khi cần danh sách động, thêm/xóa phần tử. | `ArrayList` truy cập nhanh, chèn/xóa cuối nhanh; `LinkedList` tốt khi thêm/xóa nhiều vị trí đầu/cuối. |
| **Set** (`HashSet`, `TreeSet`) | Khi không muốn phần tử trùng, cần đảm bảo tập hợp không có thứ tự hoặc có thứ tự sắp xếp. | `HashSet` nhanh, `TreeSet` sắp thứ tự nhưng chậm hơn. |
| **Map** (`HashMap`, `TreeMap`) | Khi muốn lưu cặp key-value, tìm giá trị theo khóa. | `HashMap` nhanh, không sắp thứ tự; `TreeMap` sắp thứ tự key. |
| **Queue**, **Deque** | Khi xử lý hàng đợi (FIFO) hoặc đôi khi hai đầu. | `LinkedList`, `ArrayDeque` có hỗ trợ; thao tác đầu/cuối hiệu quả. |
| **Stack** | Khi dùng Last-In-First-Out (LIFO) như undo, recursion. | Có lớp `Stack`, hoặc dùng `Deque` hiện đại hơn. |
| **PriorityQueue / Heap** | Khi muốn truy xuất phần tử có ưu tiên cao nhất. | Thao tác thêm / lấy ưu tiên tốt, thường dùng cho thuật toán như Dijkstra, event scheduling. |
| **Tree** / **Binary Tree / BST** | Cần tìm kiếm, chèn, xoá theo thứ tự; sắp sẵn sàng. | BST tốt nếu cây cân bằng; nếu không thì performance bị ảnh hưởng. |

Một vài cấu trúc đặc biệt / nâng cao:

- **Immutable Collections** / data structures bất biến.  
- **BitSet** – lưu trữ bit, tiết kiệm bộ nhớ nếu chỉ cần true/false.  
- **Graph** – thường tự cài bằng danh sách cạnh (adjacency list) hoặc ma trận cạnh (adjacency matrix).

---

## 5. Ví dụ thực hành tổng hợp

```java
// Interface định nghĩa khả năng in
interface Printable {
    void print();
}

// Abstract class để minh họa Abstraction
abstract class Shape {
    abstract double getArea();
    abstract double getPerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {  // Constructor
        this.radius = radius;        // Encapsulation: biến private
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {  // Constructor overloading có thể thêm
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Demo {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        System.out.println("Circle area: " + c.getArea() + ", perimeter: " + c.getPerimeter());
        System.out.println("Rectangle area: " + r.getArea() + ", perimeter: " + r.getPerimeter());

        // Ví dụ data structure: dùng ArrayList + Map
        java.util.List<Shape> shapes = new java.util.ArrayList<>();
        shapes.add(c);
        shapes.add(r);

        java.util.Map<String, Double> areaMap = new java.util.HashMap<>();
        for (Shape s : shapes) {
            areaMap.put(s.getClass().getSimpleName(), s.getArea());
        }
        System.out.println("Areas map: " + areaMap);
    }
}
```
==============================================================================================================================================================================================================================
# Java Tổng Quan

Tài liệu này tổng hợp các lớp (classes), hàm (functions / methods), thư viện (libraries), frameworks, và các khái niệm chính trong Java mà bạn nên biết — vừa liên quan tới code của bạn, vừa các kiến thức bổ sung.

---

## Mục lục

- [Java Core / Ngôn ngữ](#java-core--ng%C3%B4n-ng%E1%BB%AF)  
- [Thư viện chuẩn (Standard Libraries)](#th%C6%B0_vi%E1%BB%87n-chu%E1%BA%A3n-standard-libraries)  
- [Thư viện bên ngoài (External Libraries / Frameworks)](#th%C6%B0_vi%E1%BB%87n-b%C3%AAn-ng%C6%B0%E1%BB%9Bc-external-libraries--frameworks)  
- [Các lớp / packages thường dùng](#c%C3%A1c-l%C6%B0%E1%BB%A3ng--packages-th%C6%B0%E1%BB%A7ng-d%C3%B9ng)  
- [Các kiểu chức năng (Functions / Methods) phổ biến](#c%C3%A1c-k%E1%BB%B9u-ch%E1%BB%A9c-n%C4%A9ng-functions--methods-ph%E1%BB%8F-bi%E1%BB%85n)  
- [Ví dụ cấu trúc Project Java](#v%C3%AD-d%E1%BB%B5-c%E1%BA%A5u-tr%C3%BAc-project-java)  
- [Tài liệu tham khảo thêm / nâng cao](#t%C3%A0i-li%E1%BB%87u-tham-kh%E1%BA%A3o-th%C3%AAm--n%C3%A2ng-cao)

---

## Java Core / Ngôn ngữ

- Nguyên tắc OOP: **Lớp (Class), Đối tượng (Object), Kế thừa (Inheritance), Đa hình (Polymorphism), Trừu tượng (Abstraction), Đóng gói (Encapsulation)**  
- Kiểu dữ liệu cơ bản (Primitive Types): `int`, `long`, `float`, `double`, `boolean`, `char`, `byte`, `short`  
- Kiểu Reference: `String`, `Arrays`, `Collections`, v.v.  
- Exception / Error: `try / catch / finally`, `throws`, `throw`, custom exception class  
- Generics: lớp generic, interface generic, wildcards (`? extends`, `? super`)  
- Lambda expressions & functional interfaces (Java 8+): `Function<T,R>`, `Predicate<T>`, `Consumer<T>`, `Supplier<T]`  
- Streams API (Java 8+): `filter`, `map`, `reduce`, `collect`, `flatMap`  
- Concurrency: Thread, Runnable, Callable, ExecutorService, synchronization, `volatile`, `synchronized`  
- I/O: File I/O, Streams, Readers, Writers, NIO / NIO.2 (Path, Files, etc.)  
- Date & Time API (Java 8+): `java.time` — LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Period, Duration  

---

## Thư viện chuẩn (Standard Libraries)

Một số packages / classes trong Java mà hầu hết project đều sử dụng:

| Package | Chức năng chính |
|---|---|
| `java.lang` | Cơ bản: Object, String, Math, System, Wrapper classes (Integer, Double, …) |
| `java.util` | Collections Framework (List, Set, Map, Queue), Optional, Random, Scanner, Timer, Date / Calendar (cũ) |
| `java.io` / `java.nio` | Đọc/ghi file, xử lý byte / character streams, buffer, file paths, channels |
| `java.net` | Networking — sockets, URL, HTTP connections |
| `java.math` | BigInteger, BigDecimal, các chức năng số học cao cấp |
| `java.time` | Như đã trên — thời gian, múi giờ, định dạng ngày giờ |

---

## Thư viện bên ngoài (External Libraries / Frameworks)

Các thư viện này rất phổ biến, giúp giải quyết nhanh các nhu cầu thực tế:

| Tên thư viện / Framework | Mục đích / điểm nổi bật |
|---|---|
| **Apache Commons** | Tiện ích chung: Commons IO, Commons Text, CSV, etc. :contentReference[oaicite:0]{index=0} |
| **Google Guava** | Bộ tiện ích cho Collections mở rộng, I/O, hashing, caching, immutable collections, etc. :contentReference[oaicite:1]{index=1} |
| **Jackson** | Chuyển đổi giữa JSON ↔ Java objects (serialization / deserialization) :contentReference[oaicite:2]{index=2} |
| **Gson** | Thư viện JSON khác, đơn giản để dùng để serialize/deserialze Java ↔ JSON :contentReference[oaicite:3]{index=3} |
| **JUnit** | Kiểm thử (Unit Testing) — viết test case, assertion, test suite :contentReference[oaicite:4]{index=4} |
| **Mockito** | Tạo mock object để kiểm thử, tách phụ thuộc bên ngoài :contentReference[oaicite:5]{index=5} |
| **Logging**: Log4j2, SLF4J (với backend như Logback) | Quản lý logging, cấu hình linh hoạt :contentReference[oaicite:6]{index=6} |
| **Hibernate / JPA / Spring Data** | ORM, ánh xạ đối tượng ↔ database, quản lý truy vấn, session, lazy loading, etc. :contentReference[oaicite:7]{index=7} |
| **HTTP Client**: Apache HttpClient, Java built-in HttpClient | Gửi yêu cầu HTTP, xử lý response v.v. :contentReference[oaicite:8]{index=8} |
| **Thư viện xử lý XML / JSON / định dạng khác** | như JAXB, XStream, StAX, DOM v.v. :contentReference[oaicite:9]{index=9} |

---

## Các lớp / packages thường dùng

Dưới đây là các lớp / package bạn thường gặp:

- `java.lang.Object` — lớp gốc  
- `java.lang.String`  
- `java.lang.Math`  
- `java.lang.System`  
- `java.util.List`, `ArrayList`, `LinkedList`  
- `java.util.Set`, `HashSet`, `TreeSet`  
- `java.util.Map`, `HashMap`, `TreeMap`  
- `java.util.Queue`, `PriorityQueue`, `Deque`  
- `java.util.Optional`  
- `java.util.Collections` (helper methods)  
- `java.util.stream` (Stream, IntStream, etc.)  
- `java.io.File`, `FileInputStream`, `FileOutputStream`, `BufferedReader`, `BufferedWriter`  
- `java.nio.file.Path`, `Files`  
- `java.time.LocalDate`, `LocalTime`, `LocalDateTime`, `Duration`, `Instant`  

---

## Các kiểu chức năng (Functions / Methods) phổ biến

- Phương thức getter/setter  
- Phương thức khởi tạo (constructors)  
- `toString()`, `equals()`, `hashCode()` override  
- Phương thức hỗ trợ clone / copy object  
- Helper / utility methods (ví dụ: converting, formatting, parsing)  
- Validation (ví dụ: kiểm tra null, ràng buộc, exceptions)  
- Phương thức xử lý dữ liệu (filter, map, reduce)  
- Phương thức truy xuất / lưu trữ dữ liệu: CRUD (Create, Read, Update, Delete)  
- Phương thức xử lý lỗi / ngoại lệ  

---



