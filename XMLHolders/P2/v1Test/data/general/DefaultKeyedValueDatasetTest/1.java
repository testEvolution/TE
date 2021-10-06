@Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultKeyedValueDataset d1
                = new DefaultKeyedValueDataset("Test", 45.5);
        DefaultKeyedValueDataset d2 = (DefaultKeyedValueDataset) d1.clone();
        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));
    }

    