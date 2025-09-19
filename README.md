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



