//#condition polish.usePolishGui
// generated by de.enough.doc2java.Doc2Java (www.enough.de) on Sat Dec 06 15:06:44 CET 2003
/*
 * Copyright (c) 2004-2005 Robert Virkus / Enough Software
 *
 * This file is part of J2ME Polish.
 *
 * J2ME Polish is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * J2ME Polish is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with J2ME Polish; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * 
 * Commercial licenses are also available, please
 * refer to the accompanying LICENSE.txt or visit
 * http://www.j2mepolish.org for details.
 */
// package de.enough.polish.ui;

import javax.microedition.lcdui.Command;

/**
 * A listener type for receiving notification of commands that have been
 * invoked on <A HREF="Item.html"><CODE>Item</CODE></A> objects.  An <code>Item</code> can have
 * <code>Commands</code> associated with
 * it.  When such a command is invoked, the application is notified by having
 * the <A HREF="ItemCommandListener.html#commandAction(Command, Item)"><CODE>commandAction()</CODE></A> method called on the
 * <code>ItemCommandListener</code> that had been set on the
 * <code>Item</code> with a call to
 * <A HREF="Item.html#setItemCommandListener(ItemCommandListener)"><CODE>setItemCommandListener()</CODE></A>.
 * <HR>
 * 
 * 
 * @since MIDP 2.0
 */
public interface ItemCommandListener
{
	/**
	 * Called by the system to indicate that a command has been invoked on a
	 * particular item.
	 * 
	 * @param c the Command that was invoked
	 * @param item the Item on which the command was invoked
	 */
	public void commandAction( Command c, Item item);

}
