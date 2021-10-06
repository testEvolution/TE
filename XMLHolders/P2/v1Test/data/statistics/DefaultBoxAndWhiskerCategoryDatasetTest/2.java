@Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultBoxAndWhiskerCategoryDataset d1
                = new DefaultBoxAndWhiskerCategoryDataset();
        d1.add(new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0,
                new ArrayList<Double>()), "ROW1", "COLUMN1");
        DefaultBoxAndWhiskerCategoryDataset d2 
                = (DefaultBoxAndWhiskerCategoryDataset) d1.clone();
        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));

        // test independence
        d1.add(new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0,
                new ArrayList<Double>()), "ROW2", "COLUMN1");
        assertFalse(d1.equals(d2));
    }

    