@Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultKeyedValues2DDataset d1 = new DefaultKeyedValues2DDataset();
        d1.setValue(1, "V1", "C1");
        d1.setValue(null, "V2", "C1");
        d1.setValue(3, "V3", "C2");
        DefaultKeyedValues2DDataset d2 = (DefaultKeyedValues2DDataset) 
                d1.clone();
        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));
    }

    