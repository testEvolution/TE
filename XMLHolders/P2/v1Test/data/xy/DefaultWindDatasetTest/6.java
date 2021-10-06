public DefaultWindDataset createSampleDataset1() {
        Day t = new Day(1, 4, 2006);
        Object[] item1 = createItem(t, 3, 7);
        Object[] item2 = createItem(t.next(), 4, 8);
        Object[] item3 = createItem(t.next(), 5, 9);
        Object[][] series1 = new Object[][] {item1, item2, item3};
        Object[] item1b = createItem(t, 6, 10);
        Object[] item2b = createItem(t.next(), 7, 11);
        Object[] item3b = createItem(t.next(), 8, 12);
        Object[][] series2 = new Object[][] {item1b, item2b, item3b};
        Object[][][] data = new Object[][][] {series1, series2};
        return new DefaultWindDataset(data);
    }

    