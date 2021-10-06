@Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultCategoryDataset d1 = new DefaultCategoryDataset();
        DefaultCategoryDataset d2 = (DefaultCategoryDataset) d1.clone();

        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));

        // try a dataset with some content...
        d1.addValue(1.0, "R1", "C1");
        d1.addValue(2.0, "R1", "C2");
        d2 = (DefaultCategoryDataset) d1.clone();

        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));

        // check that the clone doesn't share the same underlying arrays.
        d1.addValue(3.0, "R1", "C1");
        assertFalse(d1.equals(d2));
        d2.addValue(3.0, "R1", "C1");
        assertTrue(d1.equals(d2));
    }

    