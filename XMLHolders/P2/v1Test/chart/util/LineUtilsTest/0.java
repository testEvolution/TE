private boolean lineEquals(Line2D line, double x1, double y1, double x2,
            double y2) {
        boolean result = true;
        double epsilon = 0.0000000001;
        if (Math.abs(line.getX1() - x1) > epsilon) { result = false; }
        if (Math.abs(line.getY1() - y1) > epsilon) { result = false; }
        if (Math.abs(line.getX2() - x2) > epsilon) { result = false; }
        if (Math.abs(line.getY2() - y2) > epsilon) { result = false; }
        return result;
    }

    