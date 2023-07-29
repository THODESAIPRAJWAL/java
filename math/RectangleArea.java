package math;

public class RectangleArea {
    
}
lass Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
       // Calculate the areas of the two rectangles separately
       int areaA = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);
       int areaB = Math.abs(bx1 - bx2) * Math.abs(by1 - by2);

       // Find the overlapping region
       int overlapWidth = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
       int overlapHeight = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
       int overlappingArea = overlapWidth * overlapHeight;

       // Calculate the total area by subtracting the overlapping region if any
       int totalArea = areaA + areaB - overlappingArea;

       return totalArea;
    
    }
}