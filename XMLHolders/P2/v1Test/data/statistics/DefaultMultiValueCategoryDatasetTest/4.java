@Test
    public void testEquals() {
        DefaultMultiValueCategoryDataset d1
                = new DefaultMultiValueCategoryDataset();
        DefaultMultiValueCategoryDataset d2
                = new DefaultMultiValueCategoryDataset();
        assertTrue(d1.equals(d2));
        assertTrue(d2.equals(d1));

        List<Number> values = new ArrayList<>();
        d1.add(values, "R1", "C1");
        assertFalse(d1.equals(d2));
        d2.add(values, "R1", "C1");
        assertTrue(d1.equals(d2));

        values.add(99);
        d1.add(values, "R1", "C1");
        assertFalse(d1.equals(d2));
        d2.add(values, "R1", "C1");
        assertTrue(d1.equals(d2));

        values.add(99);
        d1.add(values, "R1", "C2");
        assertFalse(d1.equals(d2));
        d2.add(values, "R1", "C2");
        assertTrue(d1.equals(d2));
    }

    