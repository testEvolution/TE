@Test
    public void testEquals() {
        DialCap c1 = new DialCap();
        DialCap c2 = new DialCap();
        assertTrue(c1.equals(c2));

        // visible
        c1.setVisible(false);
        assertFalse(c1.equals(c2));
        c2.setVisible(false);
        assertTrue(c1.equals(c2));
    }

    