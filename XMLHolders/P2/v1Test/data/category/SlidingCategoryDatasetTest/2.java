@Test
    public void testSerialization() {
        DefaultCategoryDataset u1 = new DefaultCategoryDataset();
        u1.addValue(1.0, "R1", "C1");
        u1.addValue(2.0, "R1", "C2");
        SlidingCategoryDataset d1 = new SlidingCategoryDataset(u1, 0, 5);
        SlidingCategoryDataset d2 = (SlidingCategoryDataset) 
                TestUtils.serialised(d1);
        assertEquals(d1, d2);

        // basic check for independence
        u1.addValue(3.0, "R1", "C3");
        assertFalse(d1.equals(d2));
        DefaultCategoryDataset u2
                = (DefaultCategoryDataset) d2.getUnderlyingDataset();
        u2.addValue(3.0, "R1", "C3");
        assertTrue(d1.equals(d2));
    }

    