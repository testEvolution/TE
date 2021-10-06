@Test
    public void testCloning() {
        DefaultStatisticalCategoryDataset d1
                = new DefaultStatisticalCategoryDataset();
        d1.add(1.1, 2.2, "R1", "C1");
        d1.add(3.3, 4.4, "R1", "C2");
        d1.add(null, 5.5, "R1", "C3");
        d1.add(6.6, null, "R2", "C3");
        DefaultStatisticalCategoryDataset d2 = null;
        try {
            d2 = (DefaultStatisticalCategoryDataset) d1.clone();
        }
        catch (CloneNotSupportedException e) {
            fail(e.toString());
        }
        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));

        // check independence
        d1.add(1.1, 2.2, "R3", "C1");
        assertFalse(d1.equals(d2));
    }

    