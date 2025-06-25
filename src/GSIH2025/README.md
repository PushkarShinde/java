# Intersection Points in 2D Line Graph 🖼️

Automatically detect and count the **intersection points** between lines in a 512 × 512 JPEG image of a 2-D line graph—**excluding** any intersections that lie on the *x*-axis or *y*-axis.

---

## 📑 Problem Statement

Given a filename (via standard input) that points to a JPEG image containing:

* A clearly drawn *x*-axis and *y*-axis.  
* Up to **10** straight lines (each **1 pixel** thick).  
* No noise; every line segment and intersection is fully visible inside the image boundaries.  

Write a program that outputs **one integer**: the total number of intersection points *between* the lines (axis intersections do **not** count).

---

## 🖥️ Input & Output

| | Format | Example |
|---|---|---|
| **Input** | A single line containing the image filename | `image4.jpg` |
| **Output** | A single integer – the count of valid intersections | `2` |

---

### ✨ Sample I/O

| Sample | Image (conceptual) | Expected Output | Explanation |
|--------|--------------------|-----------------|-------------|
| 0 | `image1.jpg` – lines do **not** cross | `0` | No intersections |
| 1 | `image4.jpg` – two lines cross twice | `2` | Two line-to-line intersections |

---

## 🔒 Constraints

| Category | Requirement |
|----------|-------------|
| **Image** | JPEG, 512 × 512 pixels |
| **Lines** | ≤ 10 lines, 1 pixel thick |
| **Visibility** | All lines & intersections inside the image; axes present |
| **Runtime** | 1 s (typical), memory ≤ 256 MB |

---

## 🛠️ Implementation Guidelines

1. **Read filename** from *stdin*.  
2. **Load image** (e.g. Pillow / OpenCV in Python, `javax.imageio` in Java).  
3. **Detect lines**  
   * Hough Transform or custom edge‐tracing.  
4. **Compute intersections**  
   * For every pair of detected lines, solve for intersection.  
   * Discard points lying on either axis.  
5. **Count unique points** (avoid double-counting).  
6. **Print** the resulting integer.  
7. **Gracefully handle errors** (bad file, wrong size, etc.) by printing `0`.

---
