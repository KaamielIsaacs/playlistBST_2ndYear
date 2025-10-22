Student Number: 4129581
Course: CSC211 – Data Structures & Algorithms
Year: 2023
Assignment: Practical 1 Term 2

Project Overview
This project implements a playlist management system using a Binary Search Tree (BST) in Java. Each track in the playlist is stored as a node in the BST, allowing efficient searching, insertion, and deletion of tracks.

The playlist is organized alphabetically by track title, and supports various operations including:
	•	Inserting new tracks
	•	Deleting tracks
	•	Searching for tracks
	•	Displaying all tracks in alphabetical order
	•	Calculating the height of the playlist BST
	•	Clearing the entire playlist

Files in the Project
1.	Track.java
•	Defines the Track class, which represents a single track in the playlist.
•	Each Track contains:
•	id, title, artist, album, minutes, seconds
•	References to left and right child nodes (Track left, Track right)
2.	Playlist.java
•	Implements the playlist as a BST.
•	Provides methods for:
•	insert(), delete(), search(), displayAllInOrder(), height(), clear()
3.	TestPlaylist.java
•	A driver program to demonstrate the functionality of the playlist.
•	Inserts, deletes, searches, displays, and clears tracks in the playlist.
•	Prints the playlist in alphabetical order to the console.
Features
•	BST-based implementation: Efficient alphabetical organization.
•	Prevents duplicate track titles.
•	Tracks include detailed info: ID, title, artist, album, minutes, seconds.
•	Supports full playlist management: Insert, search, delete, display, clear, height calculation.
