@Test
    public void testSparsePopulation() {
        DefaultKeyedValues2D d = new DefaultKeyedValues2D();
        d.addValue(11, "R1", "C1");
        d.addValue(22, "R2", "C2");

        assertEquals(11, d.getValue("R1", "C1"));
        assertNull(d.getValue("R1", "C2"));
        assertEquals(22, d.getValue("R2", "C2"));
        assertNull(d.getValue("R2", "C1"));
    }

    