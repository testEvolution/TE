@Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultWindDataset d1 = new DefaultWindDataset();
        DefaultWindDataset d2 = (DefaultWindDataset) d1.clone();
        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));

        // try a dataset with some content...
        d1 = createSampleDataset1();
        d2 = (DefaultWindDataset) d1.clone();
        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));
    }

    