private boolean checkIndependence(ScatterRenderer r1,
            ScatterRenderer r2) {

        // should be equal...
        if (!r1.equals(r2)) {
            return false;
        }

        // and independent...
        r1.setSeriesShapesFilled(1, true);
        if (r1.equals(r2)) {
            return false;
        }
        r2.setSeriesShapesFilled(1, true);
        if (!r1.equals(r2)) {
            return false;
        }

        r1.setBaseShapesFilled(false);
        r2.setBaseShapesFilled(true);
        if (r1.equals(r2)) {
            return false;
        }
        r2.setBaseShapesFilled(false);
        if (!r1.equals(r2)) {
            return false;
        }
        return true;

    }

    