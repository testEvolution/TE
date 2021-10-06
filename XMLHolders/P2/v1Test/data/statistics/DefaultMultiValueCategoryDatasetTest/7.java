@Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultMultiValueCategoryDataset d1
                = new DefaultMultiValueCategoryDataset();
        DefaultMultiValueCategoryDataset d2 
                = (DefaultMultiValueCategoryDataset) d1.clone();
        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));

        // try a dataset with some content...
        List<Integer> values = new ArrayList<>();
        values.add(99);
        d1.add(values, "R1", "C1");
        d2 = (DefaultMultiValueCategoryDataset) d1.clone();
        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));

        // check that the clone doesn't share the same underlying arrays.
        List<Integer> values2 = new ArrayList<>();
        values2.add(111);
        d1.add(values2, "R2", "C2");
        assertFalse(d1.equals(d2));
        d2.add(values2, "R2", "C2");
        assertTrue(d1.equals(d2));
    }

}