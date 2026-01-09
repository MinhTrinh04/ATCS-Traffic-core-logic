# Icon Inventory & Download Guide

## Folder Structure & Icon Organization

### 1. **navigation/** - Navigation & Menu Icons

These icons are used for sidebar navigation, menu items, and top navigation.

| Icon Name           | Usage                           | Size | Variants |
| ------------------- | ------------------------------- | ---- | -------- |
| `dashboard.svg`     | Dashboard/Home navigation       | 24px | Default  |
| `search.svg`        | Search functionality in sidebar | 24px | Default  |
| `settings.svg`      | Settings/configuration menu     | 24px | Default  |
| `menu.svg`          | Mobile menu toggle              | 24px | Default  |
| `chevron-down.svg`  | Dropdown menu indicator         | 16px | Default  |
| `chevron-left.svg`  | Back/previous navigation        | 16px | Default  |
| `chevron-right.svg` | Next/forward navigation         | 16px | Default  |

### 2. **ui/** - UI Component Icons

Generic UI controls and decorative icons.

| Icon Name        | Usage                  | Size | Variants                                    |
| ---------------- | ---------------------- | ---- | ------------------------------------------- |
| `badge.svg`      | Badge indicator        | 16px | Default                                     |
| `circle-dot.svg` | Radio button indicator | 16px | Default, Active, Disabled                   |
| `checkbox.svg`   | Checkbox states        | 16px | Unchecked, Checked, Indeterminate, Disabled |
| `toggle.svg`     | Toggle switch states   | 20px | Off, On, Disabled                           |
| `close.svg`      | Close/dismiss button   | 16px | Default                                     |
| `expand.svg`     | Expand panel action    | 16px | Default                                     |
| `collapse.svg`   | Collapse panel action  | 16px | Default                                     |

### 3. **status/** - Status & State Indicators

Icons representing different status conditions.

| Icon Name     | Usage                   | Size      | Variants         |
| ------------- | ----------------------- | --------- | ---------------- |
| `success.svg` | Success/positive status | 16px-24px | Default (green)  |
| `error.svg`   | Error/negative status   | 16px-24px | Default (red)    |
| `warning.svg` | Warning/caution status  | 16px-24px | Default (yellow) |
| `info.svg`    | Information status      | 16px-24px | Default (blue)   |
| `loading.svg` | Loading indicator       | 16px-24px | Animated spinner |
| `pending.svg` | Pending status          | 16px      | Default (gray)   |

### 4. **arrows/** - Directional Arrows

Traffic movement direction indicators.

| Icon Name              | Usage                   | Size | Variants |
| ---------------------- | ----------------------- | ---- | -------- |
| `arrow-up.svg`         | Upward direction        | 24px | Default  |
| `arrow-down.svg`       | Downward direction      | 24px | Default  |
| `arrow-left.svg`       | Leftward direction      | 24px | Default  |
| `arrow-right.svg`      | Rightward direction     | 24px | Default  |
| `arrow-up-left.svg`    | Diagonal direction (NW) | 24px | Default  |
| `arrow-up-right.svg`   | Diagonal direction (NE) | 24px | Default  |
| `arrow-down-left.svg`  | Diagonal direction (SW) | 24px | Default  |
| `arrow-down-right.svg` | Diagonal direction (SE) | 24px | Default  |
| `turn-left.svg`        | Turn/curve left         | 24px | Default  |
| `turn-right.svg`       | Turn/curve right        | 24px | Default  |
| `u-turn.svg`           | U-turn direction        | 24px | Default  |

### 5. **actions/** - Action Icons

Icons for interactive elements and actions.

| Icon Name            | Usage                   | Size      | Variants                  |
| -------------------- | ----------------------- | --------- | ------------------------- |
| `add.svg`            | Add/create new item     | 20px-24px | Default                   |
| `edit.svg`           | Edit item               | 20px      | Default                   |
| `delete.svg`         | Delete item             | 20px      | Default                   |
| `save.svg`           | Save changes            | 20px      | Default                   |
| `cancel.svg`         | Cancel operation        | 20px      | Default                   |
| `exit.svg`           | Exit/logout             | 20px      | Default                   |
| `print.svg`          | Print document          | 20px      | Default                   |
| `download.svg`       | Download file           | 20px      | Default                   |
| `upload.svg`         | Upload file             | 20px      | Default                   |
| `refresh.svg`        | Refresh/reload          | 20px      | Default (can be animated) |
| `calendar-event.svg` | Calendar/date selection | 20px      | Default                   |

### 6. **traffic-lights/** - Traffic Light Specific Icons

Traffic signal and vehicle related icons.

| Icon Name                  | Usage                          | Size      | Variants   |
| -------------------------- | ------------------------------ | --------- | ---------- |
| `traffic-light-green.svg`  | Green traffic light indicator  | 24px-48px | Default    |
| `traffic-light-yellow.svg` | Yellow traffic light indicator | 24px-48px | Default    |
| `traffic-light-red.svg`    | Red traffic light indicator    | 24px-48px | Default    |
| `traffic-light.svg`        | Generic traffic light          | 24px      | All phases |
| `pedestrian-light.svg`     | Pedestrian crossing light      | 24px      | Default    |
| `vehicle.svg`              | Vehicle icon                   | 24px      | Default    |
| `bike.svg`                 | Motorcycle/bike icon           | 24px      | Default    |
| `truck.svg`                | Truck/heavy vehicle            | 24px      | Default    |

### 7. **misc/** - Miscellaneous Icons

Other utility and system icons.

| Icon Name      | Usage                   | Size | Variants                  |
| -------------- | ----------------------- | ---- | ------------------------- |
| `database.svg` | Data/database reference | 20px | Default                   |
| `bell.svg`     | Notifications/alerts    | 20px | Default                   |
| `help.svg`     | Help/FAQ                | 20px | Default                   |
| `lock.svg`     | Lock/security           | 20px | Default, Locked, Unlocked |
| `eye.svg`      | Visibility toggle       | 20px | Open, Closed              |
| `filter.svg`   | Filter options          | 20px | Default                   |
| `sort.svg`     | Sort/ordering           | 20px | Default                   |
| `copy.svg`     | Copy to clipboard       | 20px | Default                   |
| `maximize.svg` | Fullscreen/maximize     | 20px | Default                   |
| `minimize.svg` | Minimize/shrink         | 20px | Default                   |

---

## How to Download Icons from Figma

1. **Go to Figma File**: Open the design file link
2. **Find Icon Components**: Look in the Components section on the left sidebar
3. **Export Process**:
   - Right-click on component → "Copy as" → "SVG" (or use Export option)
   - Or: Select the component → "Export" in right panel → Choose SVG format
4. **Save to Appropriate Folder**: Save each icon to its corresponding folder based on the table above
5. **File Naming**: Use lowercase with hyphens (e.g., `arrow-up.svg`, `traffic-light-green.svg`)

## Icon Naming Conventions

- Use **kebab-case** (lowercase with hyphens): `dashboard.svg`, `arrow-left.svg`
- Group related variants with suffix: `checkbox-checked.svg`, `toggle-on.svg`
- Use consistent prefixes for variant states:
  - `-active` for activated state
  - `-disabled` for disabled state
  - `-hover` for hover state
  - `-checked` or `-on` for selected state

## Usage in Components

Once icons are downloaded, reference them like:

```tsx
// Image component
<img src="/icons/navigation/dashboard.svg" alt="Dashboard" />

// Icon component wrapper (recommended)
<Icon name="dashboard" category="navigation" />
```

---

## Priority Download Order

Start with these high-priority icons for immediate use:

1. **Traffic Lights**: traffic-light-red.svg, traffic-light-green.svg, traffic-light-yellow.svg
2. **Navigation**: dashboard.svg, chevron-down.svg, search.svg
3. **Arrows**: arrow-up.svg, arrow-down.svg, arrow-left.svg, arrow-right.svg, turn-left.svg, turn-right.svg
4. **Status**: success.svg, error.svg, warning.svg, info.svg
5. **Actions**: add.svg, edit.svg, delete.svg, save.svg

---

## Total Icon Count

- **7 categories**
- **~60+ icons** (including variants)
- **Multiple sizes**: 16px, 20px, 24px, 48px
