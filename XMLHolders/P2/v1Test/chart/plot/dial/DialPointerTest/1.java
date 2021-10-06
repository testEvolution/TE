@Test
    public void testEqualsPin() {
        DialPointer.Pin p1 = new DialPointer.Pin();
        DialPointer.Pin p2 = new DialPointer.Pin();
        assertEquals(p1, p2);

        p1.setPaint(Color.GREEN);
        assertFalse(p1.equals(p2));
        p2.setPaint(Color.GREEN);
        assertTrue(p1.equals(p2));

        BasicStroke s = new BasicStroke(4.4f);
        p1.setStroke(s);
        assertFalse(p1.equals(p2));
        p2.setStroke(s);
        assertTrue(p1.equals(p2));
    }

    