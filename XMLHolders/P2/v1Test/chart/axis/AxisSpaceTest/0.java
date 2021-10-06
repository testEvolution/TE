@Test
    public void testEquals() {
        AxisSpace a1 = new AxisSpace();
        AxisSpace a2 = new AxisSpace();
        assertEquals(a1, a2);

        a1.setTop(1.11);
        assertFalse(a1.equals(a2));
        a2.setTop(1.11);
        assertTrue(a1.equals(a2));

        a1.setBottom(2.22);
        assertFalse(a1.equals(a2));
        a2.setBottom(2.22);
        assertTrue(a1.equals(a2));

        a1.setLeft(3.33);
        assertFalse(a1.equals(a2));
        a2.setLeft(3.33);
        assertTrue(a1.equals(a2));

        a1.setRight(4.44);
        assertFalse(a1.equals(a2));
        a2.setRight(4.44);
        assertTrue(a1.equals(a2));
    }

    