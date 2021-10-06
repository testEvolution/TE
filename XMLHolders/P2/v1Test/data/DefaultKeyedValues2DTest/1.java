@Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultKeyedValues2D v1 = new DefaultKeyedValues2D();
        v1.setValue(1, "V1", "C1");
        v1.setValue(null, "V2", "C1");
        v1.setValue(3, "V3", "C2");
        DefaultKeyedValues2D v2 = (DefaultKeyedValues2D) v1.clone();
        assertTrue(v1 != v2);
        assertTrue(v1.getClass() == v2.getClass());
        assertTrue(v1.equals(v2));

        // check that clone is independent of the original
        v2.setValue(2, "V2", "C1");
        assertFalse(v1.equals(v2));
    }

    