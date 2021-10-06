@Test
    public void testSerialization() {
        DefaultBoxAndWhiskerXYDataset d1 = new DefaultBoxAndWhiskerXYDataset(
                "Series");
        d1.add(new Date(1L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0,
                6.0, 7.0, 8.0, new ArrayList<Double>()));
        DefaultBoxAndWhiskerXYDataset d2 = (DefaultBoxAndWhiskerXYDataset) 
                TestUtils.serialised(d1);
        assertEquals(d1, d2);

        // test independence
        d1.add(new Date(2L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0,
                6.0, 7.0, 8.0, new ArrayList<Double>()));
        assertFalse(d1.equals(d2));
    }

    