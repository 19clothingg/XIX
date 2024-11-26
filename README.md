Cài đặt môi trường:
Cài đặt Docker trên Windows
Yêu cầu hệ thống:
Windows: 10 64-bit trở lên
Các bước cài đặt:
Tải bộ cài:


Truy cập trang web chính thức của Docker: https://docs.docker.com/desktop/install/windows-install/
Tải về phiên bản phù hợp với hệ thống của bạn.
Cài đặt:


Double-click vào file cài đặt vừa tải về.
Làm theo hướng dẫn:
Chọn phiên bản: Bạn có thể chọn giữa Docker Desktop hoặc Docker Engine. Docker Desktop là lựa chọn phổ biến hơn cho người mới bắt đầu vì nó cung cấp một giao diện đồ họa trực quan.
Cấu hình: Bạn có thể tùy chỉnh các cài đặt như nơi lưu trữ các image và container, hoặc sử dụng các cài đặt mặc định.
Hoàn tất cài đặt: Click vào nút "Finish" để hoàn tất quá trình cài đặt.
Kiểm tra cài đặt:


Mở Docker Desktop: Icon của Docker Desktop sẽ xuất hiện ở góc phải màn hình.
Mở terminal: Nhấn tổ hợp phím Windows + R, nhập cmd rồi nhấn Enter.
Kiểm tra phiên bản: Nhập lệnh docker --version và nhấn Enter. Nếu cài đặt thành công, bạn sẽ thấy thông tin về phiên bản Docker đang sử dụng.
Chạy một container mẫu: Nhập lệnh docker run hello-world và nhấn Enter. Nếu mọi thứ hoạt động đúng, bạn sẽ thấy một thông báo chào mừng từ Docker.


Cài đặt Java 23 trên Windows
Bước 1: Tải về Java JDK 23
Truy cập trang web của Oracle:
Mở trình duyệt web và truy cập trang web chính thức của Oracle để tải Java: https://download.oracle.com/java/23/latest/jdk-23_windows-x64_bin.msi
Bước 2: Cài đặt Java JDK
Chạy file cài đặt:
Tìm file cài đặt vừa tải về và chạy nó.
Làm theo hướng dẫn:
Chọn thư mục cài đặt: Bạn có thể chọn thư mục mặc định hoặc chỉ định một thư mục khác để cài đặt Java.
Cấu hình biến môi trường: Quá trình cài đặt sẽ tự động thêm các biến môi trường cần thiết để hệ thống có thể tìm thấy Java. Tuy nhiên, bạn có thể kiểm tra lại và cấu hình thêm nếu cần.
Hoàn tất cài đặt: Nhấp vào "Finish" để hoàn tất quá trình cài đặt.
Bước 3: Kiểm tra cài đặt
Mở cửa sổ lệnh:
Nhấn tổ hợp phím Windows + R, nhập "cmd" và nhấn Enter.
Kiểm tra phiên bản Java:
Nhập lệnh sau và nhấn Enter:
		java -version


Nếu cài đặt thành công, bạn sẽ thấy thông tin về phiên bản Java đã cài đặt.

	C. Cài đặt IntelliJ IDEA trên Windows
		Bước 1: Tải về IntelliJ IDEA
Truy cập trang web của JetBrains: Mở trình duyệt và truy cập trang web chính thức của JetBrains: https://www.jetbrains.com/idea/
Tải về phiên bản phù hợp: Chọn phiên bản IntelliJ IDEA phù hợp với hệ điều hành Windows của bạn (32-bit hoặc 64-bit) và nhu cầu sử dụng (Community Edition - miễn phí hoặc Ultimate - bản trả phí).
Bắt đầu tải: Nhấp vào nút "Download" để bắt đầu tải về file cài đặt.
Bước 2: Cài đặt IntelliJ IDEA
Chạy file cài đặt: Tìm file cài đặt vừa tải về và chạy nó.
Làm theo hướng dẫn:
Chọn thư mục cài đặt: Bạn có thể chọn thư mục mặc định hoặc chỉ định một thư mục khác để cài đặt IntelliJ IDEA.
Chọn các thành phần: Chọn các thành phần cần cài đặt, thường bao gồm IDE core, JVM, và các plugin cần thiết.
Tạo shortcut: Chọn vị trí để tạo shortcut cho IntelliJ IDEA trên desktop hoặc trong menu Start.
Hoàn tất cài đặt: Nhấp vào "Finish" để hoàn tất quá trình cài đặt.
Bước 3: Khởi chạy IntelliJ IDEA
Tìm biểu tượng: Tìm biểu tượng IntelliJ IDEA trên desktop hoặc trong menu Start.
Khởi chạy: Nhấp đúp vào biểu tượng để khởi chạy IntelliJ IDEA.


D. Cài đặt mySQL trên Docker:
Bước1: Mở cửa sổ lệnh:
Nhấn tổ hợp phím Windows + R, nhập "cmd" và nhấn Enter.
Nhập lệnh sau và nhấn Enter:

		docker pull mysql:8.0.40-debian


Vào Docker -> Image sẽ thấy được mySQL:
Khởi chạy mySQL:
Mở cmd, nhập câu lệnh và ấn Enter:
docker run --name mysql-8.0.40 -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root  -d mysql:8.0.40-debian

Quay trở lại Docker sẽ xuất hiện Port 3306, ấn Start để chạy:


E. Cài đặt MySQL Workbench trên Windows:
	Bước 1: Tải về MySQL Workbench
Truy cập trang web MySQL: Mở trình duyệt và truy cập trang web chính thức của MySQL: https://dev.mysql.com/downloads/workbench/
Chọn phiên bản: Tìm và chọn phiên bản MySQL Workbench phù hợp với hệ điều hành Windows của bạn (32-bit hoặc 64-bit).
Đồng ý với giấy phép: Đọc kỹ và đồng ý với giấy phép sử dụng.
Tải về: Nhấp vào nút "Download" để bắt đầu tải về file cài đặt.
Bước 2: Cài đặt MySQL Workbench
Chạy file cài đặt: Tìm file cài đặt vừa tải về và chạy nó.
Làm theo hướng dẫn:
Chọn thư mục cài đặt: Bạn có thể chọn thư mục mặc định hoặc chỉ định một thư mục khác để cài đặt MySQL Workbench.
Chọn các thành phần: Chọn các thành phần cần cài đặt, thường bao gồm các công cụ cơ bản của MySQL Workbench.
Tạo shortcut: Chọn vị trí để tạo shortcut cho MySQL Workbench trên desktop hoặc trong menu Start.
Hoàn tất cài đặt: Nhấp vào "Finish" để hoàn tất quá trình cài đặt.
Bước 3: Khởi chạy MySQL Workbench
Tìm biểu tượng: Tìm biểu tượng MySQL Workbench trên desktop hoặc trong menu Start.
Khởi chạy: Nhấp đúp vào biểu tượng để khởi chạy MySQL Workbench.
Bước 4: Cấu hình kết nối
Tạo một kết nối mới: Trong cửa sổ chính của MySQL Workbench, nhấp vào biểu tượng "+" để tạo một kết nối mới.
Cấu hình kết nối:
Connection Name: xix_clothing
Port: 3306
Username: root
Password: root
Test Connection: Nhập password = root  -> hộp thoại Successfully hiện lên, kết nối thành công (nếu xuất hiện lỗi, kiểm tra lại Docker -> Containers, đảm bảo rằng mysql đang chạy).
Truy cập vào connection vừa tạo: chuyển sang tab Schemas(góc dưới bên trái màn hình) sẽ xuất hiện giao diện như hình bên dưới:
Chọn new Query(dưới chữ File): nhập vào câu lệnh: create database xix_clothing; 
F5 tại thanh SCHEMAS sẽ thấy một database có tên là xix_clothing xuất hiện.


						

Khởi chạy dự án:
Download dự án: https://drive.google.com/file/d/1qicvhYfF8fZVt40V2WAVLRaPE7YAY2yW/view?usp=sharing
Sau khi tải về và giải nén sẽ xuất hiện folder có tên “xix_clothing”, kéo thả vào IntelliJ để mở.
Nhấn Ctrl+F5 hoặc nhấn vào biểu tượng tam giác ở thanh trên màn hình để chạy, đảm bảo rằng Docker và MySQL Workbench đã được khởi chạy.
Mở trình duyệt(Chrome): truy cập địa chỉ “http://localhost:8080/” là đường dẫn mặc định tới website, truy cập “http://localhost:8080/admin/add-product” dẫn tới trang dành cho admin để quản lý sản phẩm trên trang web.

	


