@Test
    public void testRemoveColumnByKey() {
        DefaultKeyedValues2D d = new DefaultKeyedValues2D();
        d.addValue(1.0, "R1", "C1");
        d.addValue(2.0, "R2", "C2");
        d.removeColumn("C2");
        d.addValue(3.0, "R2", "C2");
        assertEquals(3.0, d.getValue("R2", "C2").doubleValue(), EPSILON);

        // check for unknown column
        boolean pass = false;
        try {
            d.removeColumn("XXX");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);
    }

}