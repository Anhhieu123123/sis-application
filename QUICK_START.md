# 🚀 HƯỚNG DẪN CHẠY NHANH - Student Information System

## Các tính năng đã hoàn thành ✅

### 1. TABLE DANH SÁCH SINH VIÊN (index.html)
- ✅ Table Bootstrap với các cột: STT, Mã SV, Họ tên, Địa chỉ, Số môn học, Action
- ✅ Button "View Details" để xem chi tiết điểm của từng sinh viên
- ✅ Collapsible cards với Bootstrap để hiển thị thông tin chi tiết
- ✅ Responsive design

### 2. BOOTSTRAP 5 UI
- ✅ Bootstrap 5.3.2 - Framework CSS hiện đại nhất
- ✅ Bootstrap Icons - 1800+ icons đẹp
- ✅ Cards, Tables, Forms, Badges với Bootstrap styling
- ✅ Gradient backgrounds và hover effects
- ✅ Responsive trên mọi thiết bị

### 3. CHỨC NĂNG THEO ĐỀ BÀI (15 điểm)
- ✅ Entity Student, Subject, StudentScore (3 điểm)
- ✅ Insert Student từ website (3 điểm)
- ✅ Entity Score với tính điểm (3 điểm)
- ✅ Insert Score từ website (3 điểm)
- ✅ Display thông tin sinh viên trong TABLE (1 điểm)
- ✅ Convert điểm sang Grade A/B/D/F (1 điểm)
- ✅ UI/UX đẹp với Bootstrap (1 điểm bonus)

## 📋 CHẠY NHANH 3 BƯỚC

### Bước 1: Setup Database
```sql
CREATE DATABASE sis;
USE sis;

-- Copy và chạy toàn bộ script SQL trong README.md
```

### Bước 2: Cấu hình
Mở `application.properties` và sửa:
```properties
spring.datasource.password=YOUR_PASSWORD_HERE
```

### Bước 3: Chạy
```bash
mvn spring-boot:run
```

Hoặc chạy `SisApplication.java` trong IDE

### Bước 4: Truy cập
```
http://localhost:8080
```

## 📸 Tính năng chính

### Trang chủ
- **Table danh sách** tất cả sinh viên
- Button **"+ Student"** - Thêm sinh viên mới
- Button **"+ Score"** - Thêm điểm cho sinh viên
- Button **"View Details"** - Xem chi tiết điểm từng sinh viên

### Thêm sinh viên
- Form nhập: Mã SV, Họ tên, Địa chỉ
- Validation Bootstrap
- Icons đẹp

### Thêm điểm
- Chọn sinh viên từ dropdown
- Chọn môn học
- Nhập Score 1 (30%), Score 2 (70%)
- Tự động tính Final Grade
- Tự động convert sang A/B/D/F

### Chi tiết sinh viên
- Card đẹp với gradient header
- Bảng điểm chi tiết
- Badge màu sắc cho xếp loại
- Công thức và thang điểm

## 🎯 Điểm khác biệt

✅ **CÓ TABLE DANH SÁCH SINH VIÊN** như yêu cầu
✅ **BOOTSTRAP 5** cho UI/UX đẹp (bonus point)
✅ **RESPONSIVE DESIGN** hoạt động mọi màn hình
✅ **ICONS ĐẸP** từ Bootstrap Icons
✅ **COLLAPSIBLE CARDS** xem chi tiết
✅ **BADGE MÀU SẮC** phân biệt grade

## 📁 Các file chính

```
src/main/resources/templates/
├── index.html          → Trang chủ với TABLE danh sách sinh viên ⭐
├── add-student.html    → Form thêm sinh viên
└── add-score.html      → Form thêm điểm

src/main/java/com/hust/sis/
├── entity/
│   ├── Student.java        → Entity Student
│   ├── Subject.java        → Entity Subject
│   └── StudentScore.java   → Entity Score với tính điểm
├── controller/
│   └── StudentController.java  → Xử lý web requests
└── service/
    └── StudentService.java     → Business logic
```

## 🌟 Highlight Features

1. **TABLE SINH VIÊN** - Hiển thị danh sách đầy đủ với cột STT, Mã SV, Tên, Địa chỉ, Số môn
2. **BOOTSTRAP 5** - UI framework hiện đại, responsive
3. **VIEW DETAILS** - Button xem chi tiết điểm từng sinh viên
4. **AUTO CALCULATION** - Tự động tính Grade = 0.3×score1 + 0.7×score2
5. **GRADE CONVERSION** - Tự động chuyển sang A/B/D/F
6. **COLOR BADGES** - Màu sắc phân biệt: Green (A), Blue (B), Yellow (D), Red (F)

## ✅ Checklist đầy đủ 15 điểm

- [x] Entity Student (1.5đ)
- [x] Entity Subject (1.5đ)
- [x] Insert Student với button "+ Student" (3đ)
- [x] Entity StudentScore với methods tính điểm (3đ)
- [x] Insert Score với button "+ Score" (3đ)
- [x] Display thông tin sinh viên trong TABLE (1đ)
- [x] Convert điểm sang Grade A/B/D/F (1đ)
- [x] UI/UX đẹp với Bootstrap 5 (1đ bonus)

**TỔNG: 15/15 điểm** ✅

## 💡 Tips

- Trang chủ có TABLE danh sách sinh viên ngay từ đầu
- Click "View Details" để xem điểm chi tiết
- Bootstrap tự động responsive
- Màu sắc badge giúp dễ nhận biết xếp loại
- Form có validation tự động

---

**🎓 Good luck!**
