@Test
    public void testLimitPieDataset() {

        // check that empty dataset is handled OK
        DefaultPieDataset d1 = new DefaultPieDataset();
        PieDataset d2 = DatasetUtils.createConsolidatedPieDataset(d1,
                "Other", 0.05);
        assertEquals(0, d2.getItemCount());

        // check that minItem limit is observed
        d1.setValue("Item 1", 1.0);
        d1.setValue("Item 2", 49.50);
        d1.setValue("Item 3", 49.50);
        d2 = DatasetUtils.createConsolidatedPieDataset(d1, "Other", 0.05);
        assertEquals(3, d2.getItemCount());
        assertEquals("Item 1", d2.getKey(0));
        assertEquals("Item 2", d2.getKey(1));
        assertEquals("Item 3", d2.getKey(2));

        // check that minItem limit is observed
        d1.setValue("Item 4", 1.0);
        d2 = DatasetUtils.createConsolidatedPieDataset(d1, "Other", 0.05,
                2);

        // and that simple aggregation works
        assertEquals(3, d2.getItemCount());
        assertEquals("Item 2", d2.getKey(0));
        assertEquals("Item 3", d2.getKey(1));
        assertEquals("Other", d2.getKey(2));
        assertEquals(2.0, d2.getValue("Other"));

    }

    