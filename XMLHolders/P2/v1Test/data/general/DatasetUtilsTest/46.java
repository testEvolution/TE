private CategoryDataset createCategoryDataset1() {
        DefaultCategoryDataset result = new DefaultCategoryDataset();
        result.addValue(1.0, "R0", "C0");
        result.addValue(1.0, "R1", "C0");
        result.addValue(1.0, "R2", "C0");
        result.addValue(4.0, "R0", "C1");
        result.addValue(5.0, "R1", "C1");
        result.addValue(6.0, "R2", "C1");
        return result;
    }

    