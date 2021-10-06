@Test
    public void testHashCode() {
        AxisLocation a1 = AxisLocation.TOP_OR_RIGHT;
        AxisLocation a2 = AxisLocation.TOP_OR_RIGHT;
        assertTrue(a1.equals(a2));
        int h1 = a1.hashCode();
        int h2 = a2.hashCode();
        assertEquals(h1, h2);
    }

    