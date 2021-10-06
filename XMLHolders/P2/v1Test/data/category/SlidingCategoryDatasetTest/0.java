@Test
    public void testEquals() {
        DefaultCategoryDataset u1 = new DefaultCategoryDataset();
        u1.addValue(1.0, "R1", "C1");
        u1.addValue(2.0, "R1", "C2");
        SlidingCategoryDataset d1 = new SlidingCategoryDataset(u1, 0, 5);
        DefaultCategoryDataset u2 = new DefaultCategoryDataset();
        u2.addValue(1.0, "R1", "C1");
        u2.addValue(2.0, "R1", "C2");
        SlidingCategoryDataset d2 = new SlidingCategoryDataset(u2, 0, 5);
        assertTrue(d1.equals(d2));

        d1.setFirstCategoryIndex(1);
        assertFalse(d1.equals(d2));
        d2.setFirstCategoryIndex(1);
        assertTrue(d1.equals(d2));

        d1.setMaximumCategoryCount(99);
        assertFalse(d1.equals(d2));
        d2.setMaximumCategoryCount(99);
        assertTrue(d1.equals(d2));

        u1.addValue(3.0, "R1", "C3");
        assertFalse(d1.equals(d2));
        u2.addValue(3.0, "R1", "C3");
        assertTrue(d1.equals(d2));
    }

    