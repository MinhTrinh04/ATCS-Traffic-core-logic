# ATCS - Adaptive Traffic Control System

## Giao diện Trực quan Hóa Giao Lộ Giao Thông (Intersection Visualization)

Ứng dụng React hiển thị giao lộ giao thông với các thành phần hoàn chỉnh bao gồm lane, đèn giao thông, đường dành cho người đi bộ, mũi tên hướng dẫn, v.v.

### 📁 Cấu trúc Components

```
src/
├── components/
│   ├── Colors.js              # Định nghĩa các màu sắc
│   ├── TrafficLight.js        # Đèn giao thông (Red/Yellow/Green)
│   ├── Lane.js                # Lộ đường với vạch
│   ├── Arrow.js               # Mũi tên chỉ hướng
│   ├── RoadMarkings.js        # Vạch trên đường
│   ├── PedestrianCrossing.js  # Đường dành cho người đi bộ
│   ├── PhaseIndicator.js      # Chỉ báo pha giao thông
│   ├── Intersection.js        # Thành phần chính (tích hợp tất cả)
│   └── index.js               # Export các components
├── App.js                      # Thành phần ứng dụng chính
├── App.css                     # CSS chung
└── index.js                    # Entry point
```

### 🎨 Màu Sắc Được Sử Dụng

| Tên       | Mã Hex  | Sử Dụng                          |
| --------- | ------- | -------------------------------- |
| Lane Gray | #777B7E | Màu nền lane                     |
| Green     | #007F00 | Đèn xanh - Đi                    |
| Yellow    | #DBC145 | Đèn vàng - Chú ý                 |
| Red       | #CC0000 | Đèn đỏ - Dừng                    |
| Beige     | #D8D1AA | Lane ID label, pha indicator     |
| Black     | #000000 | Vạch, đường dành cho người đi bộ |
| White     | #FFFFFF | Vạch trên đường, mũi tên         |

### 🚀 Cách Sử Dụng

#### 1. Cài đặt dependencies

```bash
cd react-intersection
npm install
```

#### 2. Chạy ứng dụng

```bash
npm start
```

Ứng dụng sẽ mở tại `http://localhost:3000`

#### 3. Build cho production

```bash
npm run build
```

### 📦 Các Components Chính

#### **Intersection** (Thành phần chính)

Tích hợp toàn bộ giao lộ:

- 4 lane (North, South, East, West)
- 4 đèn giao thông (ở 4 góc)
- 2 đường dành cho người đi bộ (N-S và E-W)
- Mũi tên chỉ hướng
- Chỉ báo pha giao thông
- Vạch giao thông

```jsx
import { Intersection } from "./components/Intersection";

function App() {
  return <Intersection />;
}
```

#### **TrafficLight**

Hiển thị đèn giao thông:

```jsx
<TrafficLight status="green" position="top-left" />
```

Props:

- `status`: 'red' | 'yellow' | 'green'
- `position`: 'top-left' | 'top-right' | 'bottom-left' | 'bottom-right'

#### **Lane**

Hiển thị lộ đường:

```jsx
<Lane id={1} direction="north" width={60} length={150} />
```

Props:

- `id`: ID của lane
- `direction`: 'north' | 'south' | 'east' | 'west'
- `width`: Chiều rộng (px)
- `length`: Chiều dài (px)
- `isDashed`: Có vạch đứt hay không

#### **Arrow**

Hiển thị mũi tên chỉ hướng:

```jsx
<Arrow direction="down" size={30} color={COLORS.WHITE} x={10} y={20} />
```

Props:

- `direction`: 'up' | 'down' | 'left' | 'right'
- `size`: Kích thước (px)
- `color`: Màu sắc
- `x`, `y`: Vị trí

#### **PedestrianCrossing**

Hiển thị đường dành cho người đi bộ:

```jsx
<PedestrianCrossing
  direction="horizontal"
  width={100}
  length={60}
  status="walk"
/>
```

Props:

- `direction`: 'horizontal' | 'vertical'
- `width`: Chiều rộng
- `length`: Chiều dài
- `status`: 'walk' | 'dont-walk'

#### **RoadMarkings**

Hiển thị vạch giao thông:

```jsx
<RoadMarkings type="dashed" direction="vertical" length={100} width={2} />
```

Props:

- `type`: 'solid' | 'dashed' | 'double'
- `direction`: 'horizontal' | 'vertical'
- `length`: Chiều dài
- `width`: Chiều rộng vạch

### ⚙️ Tính Năng

✅ Hiển thị giao lộ giao thông đúng chuẩn
✅ Đèn giao thông tự động chuyển đổi theo pha
✅ Tín hiệu người đi bộ (Walk/Don't Walk)
✅ Chỉ báo pha hiện tại
✅ Mũi tên chỉ hướng di chuyển
✅ Các vạch giao thông tiêu chuẩn
✅ Giao diện responsive
✅ Tính năng cập nhật thông tin real-time

### 🔧 Tùy Chỉnh

Để thay đổi các màu sắc, chỉnh sửa file [Colors.js](src/components/Colors.js):

```javascript
export const COLORS = {
  LANE_GRAY: "#777B7E",
  GREEN: "#007F00",
  // ... các màu khác
};
```

### 📝 Ghi Chú

- Các đèn giao thông tự động chuyển đổi (Red → Yellow → Green)
- Tín hiệu người đi bộ đồng bộ với đèn giao thông
- Phased intersection control (Điều khiển giao lộ theo pha)
- Hỗ trợ animation mượt mà

### 📄 License

MIT
