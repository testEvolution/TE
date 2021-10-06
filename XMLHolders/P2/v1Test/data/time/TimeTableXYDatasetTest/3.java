@Test
    public void testClone() {

        TimeTableXYDataset d = new TimeTableXYDataset();
        d.add(new Year(1999), 25.0, "Series");

        TimeTableXYDataset clone = null;
        try {
            clone = (TimeTableXYDataset) d.clone();
        }
        catch (CloneNotSupportedException e) {
            assertTrue(false);
        }
        assertTrue(clone.equals(d));

        // now test that the clone is independent of the original
        clone.add(new Year(2004), 1.2, "SS");
        assertFalse(clone.equals(d));
    }

    