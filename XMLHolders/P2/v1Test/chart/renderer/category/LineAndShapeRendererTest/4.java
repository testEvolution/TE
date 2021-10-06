private boolean checkIndependence(LineAndShapeRenderer r1,
                                      LineAndShapeRenderer r2) {

        // should be equal...
        if (!r1.equals(r2)) {
            return false;
        }

        // and independent...
        r1.setDefaultLinesVisible(!r1.getDefaultLinesVisible());
        if (r1.equals(r2)) {
            return false;
        }
        r2.setDefaultLinesVisible(r1.getDefaultLinesVisible());
        if (!r1.equals(r2)) {
            return false;
        }

        r1.setSeriesLinesVisible(1, true);
        if (r1.equals(r2)) {
            return false;
        }
        r2.setSeriesLinesVisible(1, true);
        if (!r1.equals(r2)) {
            return false;
        }

        r1.setDefaultShapesVisible(!r1.getDefaultShapesVisible());
        if (r1.equals(r2)) {
            return false;
        }
        r2.setDefaultShapesVisible(r1.getDefaultShapesVisible());
        if (!r1.equals(r2)) {
            return false;
        }

        r1.setSeriesShapesVisible(1, true);
        if (r1.equals(r2)) {
            return false;
        }
        r2.setSeriesShapesVisible(1, true);
        if (!r1.equals(r2)) {
            return false;
        }

        r1.setSeriesShapesFilled(0, false);
        r2.setSeriesShapesFilled(0, true);
        if (r1.equals(r2)) {
            return false;
        }
        r2.setSeriesShapesFilled(0, false);
        if (!r1.equals(r2)) {
            return false;
        }

        r1.setDefaultShapesFilled(false);
        r2.setDefaultShapesFilled(true);
        if (r1.equals(r2)) {
            return false;
        }
        r2.setDefaultShapesFilled(false);
        if (!r1.equals(r2)) {
            return false;
        }
        return true;

    }

    