-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 09, 2016 at 07:58 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `news`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `name`) VALUES
(1, 'Thời sự'),
(2, 'Thế giới'),
(3, 'Kinh doanh'),
(4, 'Giải trí'),
(5, 'Thể thao'),
(6, 'Pháp luật'),
(7, 'Giáo dục'),
(8, 'Sức khỏe'),
(9, 'Gia đình'),
(10, 'Du lịch'),
(11, 'Khoa học'),
(12, 'Số hóa');

-- --------------------------------------------------------

--
-- Table structure for table `tintuc`
--

CREATE TABLE `tintuc` (
  `id_tin` int(100) NOT NULL,
  `tentin` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `danhmuc` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `hinhanh` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `mota` text COLLATE utf8_unicode_ci NOT NULL,
  `ngaydang` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `chitiet` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tintuc`
--

INSERT INTO `tintuc` (`id_tin`, `tentin`, `danhmuc`, `hinhanh`, `mota`, `ngaydang`, `chitiet`) VALUES
(1, 'Nhiều du khách mắc kẹt trên đường lên Sa Pa', 'Thời sự', '', 'Sạt lở sau mưa lớn khiến một số đoạn trên tuyến đường từ Lào Cai lên Sa Pa bị chia cắt, khoảng 20 xe không thể di chuyển, nhiều du khách bị kẹt lại.', '2016-08-01', 'Ông Nguyễn Xuân Trường, Phó Chủ tịch huyện Sa Pa, cho biết có khoảng 20 xe bị mắc kẹt tại đoạn gần thủy điện Cốc San và chưa thống kê đầy đủ lượng du khách bị kẹt lại.  Theo ông Trường, các du khách ở Sa Pa trong hai ngày qua không nhiều và đều an toàn khi nghỉ tại thị trấn. Hầu hết du khách mắc kẹt trên đường đều theo tuyến từ Lào Cai lên Sa Pa khi đi nghỉ cuối tuần.  "Các lực lượng cứu hộ đang làm việc hết công suất để giải tỏa các điểm chia cắt. 18h mới có thể thông xe tuyến đường lên Sa Pa", ông Trường nói thêm.'),
(2, 'Bóng hồng lãnh đạo Bộ Quốc phòng Nhật Bản', 'Thế giới', '', 'Xuất thân là luật sư và là đồng minh thân cận của Thủ tướng Shinzo Abe, bà Tomomi Inada trở thành người phụ nữ thứ hai nắm giữ cương vị Bộ trưởng Quốc phòng Nhật Bản.', '2016-08-02', 'Bà Tomomi Inada hôm 3/8 được bổ nhiệm làm lãnh đạo Bộ Quốc phòng, trở thành người phụ nữ thứ hai ở Nhật Bản đảm nhận cương vị này. Người đầu tiên nắm giữ vai trò này là bà Yuriko Koike, được bổ nhiệm năm 2007. Ảnh: Reuters'),
(3, 'Công ty chăn nuôi bò của Bầu Đức bác tin đồn hủy niêm yết', 'Kinh doanh', '', 'Nông nghiệp Hoàng Anh Gia Lai vừa chính thức lên tiếng phủ nhận tin đồn cổ phiếu HNG hủy niêm yết. ', '2016-08-09', 'Công ty Nông nghiệp Quốc tế Hoàng Anh Gia Lai (Mã CK: HNG) vừa có thông tin chính thức gửi đến nhà đầu tư, cho biết tin đồn cổ phiếu HNG của công ty sẽ hủy niêm yết là không chính xác. Doanh nghiệp này khẳng định không có chủ trương bãi yết, đồng thời cũng không vi phạm các quy định của cơ quan quản lý, dẫn tới bị hủy niêm yết bắt buộc.'),
(4, 'Lương tăng chậm nhất trong một thập kỷ, doanh nghiệp vẫn lo kiệt quệ', 'Kinh doanh', '', 'Mức tăng bình quân 7,3% là thấp nhất từ năm 2007 đến nay, song đại diện nhiều doanh nghiệp vẫn cảnh báo nguy cơ lao động chưa kịp vui vì tăng lương thì đã phải nếm nỗi buồn mất việc.', '2016-08-18', 'Hội đồng Tiền lương Quốc gia với đại diện của cả giới chủ, người lao động và cơ quan quản lý vừa thống nhất đề xuất phương án tăng lương tối thiểu vùng năm 2017 lên Chính phủ phê duyệt. Theo đó, mức lương tối thiểu cho người lao động trong năm sau sẽ là 3,75 triệu đồng, 3,1 triệu đồng, 2,7 triệu đồng và 2,4 triệu đồng, tương ứng với các vùng I, II, III và IV. Như vậy, trong vòng một thập kỷ qua, mức tăng bình quân 7,3% của năm 2017 là thấp nhất.'),
(5, 'Thí sinh Next Top chấn thương vì nhảy từ giàn giáo cao 3m', 'Giải trí', '', 'Do không cẩn thận, thí sinh Minh Phong và Ngọc Châu bị trật chân, bong gân ở thử thách mới tại cuộc thi tìm kiếm người mẫu.', '2016-08-17', 'Trong tập 4 Vietnam Next Top Model phát sóng ngày 7/8, các thí sinh đến với thử thách chụp hình chủ đề "Chuyến phiêu lưu của những nhà thám hiểm". Họ phải nhảy từ giàn giáo cao 3 m xuống đất để sở hữu những bức ảnh ấn tượng.'),
(6, 'Thanh Hằng cười thẹn nhìn thí sinh Next Top hôn nhau', 'Giải trí', '', 'Duy Minh và Thiếu Lan có nụ hôn sâu dù chỉ là diễn để chụp ảnh trong một thử thách của cuộc thi.', '2016-08-19', 'Trong tập 3 phát sóng vào tối 31/7, top 16 phải trải qua thử thách chụp ảnh với chủ đề "Chuyến tàu quá khứ". Các thí sinh hóa thành những chàng trai, cô gái thập niên 1960 diễn cảnh cảm xúc ở nhà ga.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tintuc`
--
ALTER TABLE `tintuc`
  ADD PRIMARY KEY (`id_tin`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `tintuc`
--
ALTER TABLE `tintuc`
  MODIFY `id_tin` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
