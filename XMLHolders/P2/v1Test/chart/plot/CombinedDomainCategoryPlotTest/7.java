public CategoryDataset createDataset2() {

        DefaultCategoryDataset result = new DefaultCategoryDataset();

        // row keys...
        String series1 = "Third";
        String series2 = "Fourth";

        // column keys...
        String type1 = "Type 1";
        String type2 = "Type 2";
        String type3 = "Type 3";
        String type4 = "Type 4";
        String type5 = "Type 5";
        String type6 = "Type 6";
        String type7 = "Type 7";
        String type8 = "Type 8";

        result.addValue(11.0, series1, type1);
        result.addValue(14.0, series1, type2);
        result.addValue(13.0, series1, type3);
        result.addValue(15.0, series1, type4);
        result.addValue(15.0, series1, type5);
        result.addValue(17.0, series1, type6);
        result.addValue(17.0, series1, type7);
        result.addValue(18.0, series1, type8);

        result.addValue(15.0, series2, type1);
        result.addValue(17.0, series2, type2);
        result.addValue(16.0, series2, type3);
        result.addValue(18.0, series2, type4);
        result.addValue(14.0, series2, type5);
        result.addValue(14.0, series2, type6);
        result.addValue(12.0, series2, type7);
        result.addValue(11.0, series2, type8);

        return result;

    }

    